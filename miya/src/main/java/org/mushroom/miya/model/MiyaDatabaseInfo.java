package org.mushroom.miya.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 病历数据库信息
 */

@Data
@Entity
public class MiyaDatabaseInfo {

    @Id
    private Long id;

    private String name;

    private String user;

    private String password;

    private String system;

    private String url;
}
