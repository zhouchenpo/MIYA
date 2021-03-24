package org.mushroom.miya.service.impl;

import org.mushroom.miya.model.MiyaDatabaseInfo;
import org.mushroom.miya.repository.MiyaDatabaseRepository;
import org.mushroom.miya.service.MiyaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MiyaDatabaseServiceImpl implements MiyaDatabaseService {

    @Autowired
    private MiyaDatabaseRepository databaseRepository;

    @Override
    public MiyaDatabaseInfo save(MiyaDatabaseInfo info) {
        return databaseRepository.save(info);
    }

    @Override
    public List<MiyaDatabaseInfo> getAll() {
        return databaseRepository.findAll();
    }
}
