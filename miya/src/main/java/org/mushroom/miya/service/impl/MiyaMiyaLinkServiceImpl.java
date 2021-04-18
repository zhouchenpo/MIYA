package org.mushroom.miya.service.impl;

import org.mushroom.miya.model.MiyaStandardMedicalRecord;
import org.mushroom.miya.service.MiyaLinkService;

public class MiyaMiyaLinkServiceImpl implements MiyaLinkService {

    @Override
    public Boolean isALinkage(MiyaStandardMedicalRecord record1, MiyaStandardMedicalRecord record2) {
        if(record1 == null || record2 == null) {
            return false;
        }
        if(record1.getIdNumber().equals(record2.getIdNumber())) {
            return true;
        }
        if(record1.getName().equals(record2.getName())) {
            return true;
        }
        return null;
    }

    @Override
    public Integer linkWithAScore(MiyaStandardMedicalRecord record1, MiyaStandardMedicalRecord record2) {
        return 1;
    }

    @Override
    public void linkageHandler() {

    }
}
