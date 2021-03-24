package org.mushroom.miya.model.common;

import lombok.Data;

@Data
public class ActionResult<T>{
    private T data;
    private String message;
    private boolean success;

}
