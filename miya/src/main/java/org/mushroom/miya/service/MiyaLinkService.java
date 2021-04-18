package org.mushroom.miya.service;

import org.mushroom.miya.model.MiyaStandardMedicalRecord;
import org.springframework.stereotype.Service;

@Service
public interface MiyaLinkService {
    Boolean isALinkage(MiyaStandardMedicalRecord record1, MiyaStandardMedicalRecord record2);

    Integer linkWithAScore(MiyaStandardMedicalRecord record1, MiyaStandardMedicalRecord record2);

    void linkageHandler();
}
