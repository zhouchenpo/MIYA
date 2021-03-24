package org.mushroom.miya.repository;

import org.mushroom.miya.model.MiyaStandardMedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MiyaStandardMedicalRecordRepository extends JpaRepository<MiyaStandardMedicalRecord, Long> {
    MiyaStandardMedicalRecord getByDatabaseIdAndDatabaseDataId(Long databaseId, Long DatabaseDataId);
}
