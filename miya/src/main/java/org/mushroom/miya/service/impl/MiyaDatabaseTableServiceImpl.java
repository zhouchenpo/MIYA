package org.mushroom.miya.service.impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.mushroom.miya.model.MiyaDatabaseTableInfo;
import org.mushroom.miya.model.MiyaStandardMedicalRecord;
import org.mushroom.miya.model.common.RecordMapEntity;
import org.mushroom.miya.repository.MiyaDatabaseTableRepository;
import org.mushroom.miya.repository.MiyaStandardMedicalRecordRepository;
import org.mushroom.miya.service.MiyaDatabaseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Slf4j
@Service
public class MiyaDatabaseTableServiceImpl implements MiyaDatabaseTableService {

    @Autowired
    private MiyaDatabaseTableRepository databaseRepository;

    @Autowired
    private MiyaStandardMedicalRecordRepository medicalRecordRepository;

    @Override
    public MiyaDatabaseTableInfo save(MiyaDatabaseTableInfo info) {
        return databaseRepository.save(info);
    }

    @Override
    public List<MiyaDatabaseTableInfo> getAll() {
        return databaseRepository.findAll();
    }

    @Override
    public void standardiseAllRecordInDB(Long databaseId) {
        MiyaDatabaseTableInfo info = databaseRepository.getById(databaseId);
        RecordMapEntity map = JSON.parseObject(info.getMap(), RecordMapEntity.class);

        try (Connection conn = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword());
             Statement stmt = conn.createStatement()) {
            log.info("开始查询病历表中信息");
            String sql;
            sql = "SELECT id," + RecordMapEntity.SQL_FIELD + " FROM " + info.getTableName();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Long id = rs.getLong("id");
                Long tableId = info.getId();
                if (medicalRecordRepository.getByTableIdAndDataId(tableId, id) == null) {
                    MiyaStandardMedicalRecord newRecord = convertMedicalRecordWithRs(rs, map);
                    newRecord.setTableId(tableId);
                    newRecord.setDataId(id);
                    medicalRecordRepository.save(newRecord);
                    log.info("新增标准化病历{}", newRecord);
                }

            }
            rs.close();
        } catch (Exception se) {
            log.error(se.toString());
        }
    }

    private MiyaStandardMedicalRecord convertMedicalRecordWithRs(ResultSet rs, RecordMapEntity map) throws SQLException {
        MiyaStandardMedicalRecord record = new MiyaStandardMedicalRecord();
        record.setName(rs.getString(map.getName()));
        record.setBirthday(rs.getString(map.getBirthday()));
        record.setIdNumber(rs.getString(map.getIdNumber()));
        record.setMobile(rs.getString(map.getMobile()));
        return record;
    }
}

