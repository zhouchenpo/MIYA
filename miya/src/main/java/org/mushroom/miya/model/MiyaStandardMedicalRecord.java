package org.mushroom.miya.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 标准化后的病历数据
 */

@Data
@Entity
public class MiyaStandardMedicalRecord {

    @Id
    private Long id;

    private String name;

    private String idNumber;

    private String birthday;

    private String mobile;

    private Long databaseId;

    private Long databaseDataId;
}
