
package com.example.machinetestapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubjectBean {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Branch> data = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Branch> getData() {
        return data;
    }

    public void setData(List<Branch> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SubjectBean{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
