package org.mushroom.miya.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 病历数据库表信息
 */

@Data
@Entity
public class MiyaDatabaseTableInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String databaseName;

    private String tableName;

    private String user;

    private String password;

    private String system;

    private String url;

    private String map;
}
