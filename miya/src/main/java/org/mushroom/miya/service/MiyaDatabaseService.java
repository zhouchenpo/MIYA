package org.mushroom.miya.service;

import org.mushroom.miya.model.MiyaDatabaseInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MiyaDatabaseService {

    MiyaDatabaseInfo save(MiyaDatabaseInfo info);
    List<MiyaDatabaseInfo> getAll();
}
