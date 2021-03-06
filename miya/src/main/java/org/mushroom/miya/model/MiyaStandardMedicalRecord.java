package org.mushroom.miya.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 标准化后的病历数据
 */

@Data
@Entity
public class MiyaStandardMedicalRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String idNumber;

    private String birthday;

    private String mobile;

    private Long tableId;

    private Long dataId;
}
