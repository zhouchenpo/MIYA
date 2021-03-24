package org.mushroom.miya.repository;

import org.mushroom.miya.model.MiyaDatabaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MiyaDatabaseRepository extends JpaRepository<MiyaDatabaseInfo, Long> {
    List<MiyaDatabaseInfo> findAll();
}
