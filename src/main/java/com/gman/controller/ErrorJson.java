package com.gman.controller;

import java.util.Map;

/**
 * Created by gmanpark on 2015-11-27.
 */
public class ErrorJson {
    public Integer status;
    public String error;
    public String message;
    public String timeStamp;
    public String trace;

    public ErrorJson(int status, Map<String, Object> errorAttributes) {
        this.status = status;
        this.error = (String) errorAttributes.get("error");
        this.message = (String) errorAttributes.get("message");
        this.timeStamp = errorAttributes.get("timestamp").toString();
        this.trace = (String) errorAttributes.get("trace");
    }
}
