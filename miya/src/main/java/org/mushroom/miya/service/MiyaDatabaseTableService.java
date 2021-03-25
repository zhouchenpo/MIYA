package org.mushroom.miya.service;

import org.mushroom.miya.model.MiyaDatabaseTableInfo;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface MiyaDatabaseTableService {

    MiyaDatabaseTableInfo save(MiyaDatabaseTableInfo info);
    List<MiyaDatabaseTableInfo> getAll();
    void standardiseAllRecordInDB(Long databaseId) throws SQLException;
    void deleteById(Long id);
}
