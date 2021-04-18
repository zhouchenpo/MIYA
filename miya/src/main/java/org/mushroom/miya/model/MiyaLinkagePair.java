package org.mushroom.miya.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 链接结果
 */

@Entity
@Data
public class MiyaLinkagePair {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long tableId1;

    private Long tableId2;

    private Long dataId1;

    private Long dataId2;

    private Integer score;
}
