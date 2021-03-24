package org.mushroom.miya.repository;

import org.mushroom.miya.model.MiyaDatabaseTableInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MiyaDatabaseTableRepository extends JpaRepository<MiyaDatabaseTableInfo, Long> {
    List<MiyaDatabaseTableInfo> findAll();
    MiyaDatabaseTableInfo getById(Long id);
}
