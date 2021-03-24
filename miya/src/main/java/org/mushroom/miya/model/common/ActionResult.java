package org.mushroom.miya.model.common;

import lombok.Data;

@Data
public class ActionResult<T>{
    private T data;
    private String message;
    private boolean success;

    public ActionResult(T data) {
        this.data = data;
        this.success = true;
    }

    public ActionResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public ActionResult(T data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }
}
