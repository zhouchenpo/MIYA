package org.mushroom.miya.model.common;

import lombok.Data;

@Data
public class RecordMapEntity {

    public static final String SQL_FIELD = "name, id_number, birthday, mobile";

    private String name;

    private String idNumber;

    private String birthday;

    private String mobile;

    public RecordMapEntity(String name, String idNumber, String birthday, String mobile) {
        this.name = name;
        this.idNumber = idNumber;
        this.birthday = birthday;
        this.mobile = mobile;
    }

    public RecordMapEntity() {
    }
}
