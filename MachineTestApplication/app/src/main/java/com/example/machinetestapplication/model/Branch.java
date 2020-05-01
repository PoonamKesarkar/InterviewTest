
package com.example.machinetestapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Branch {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("branchName")
    @Expose
    private String branchName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("courseId")
    @Expose
    private Object courseId;
    @SerializedName("active")
    @Expose
    private Boolean active;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getCourseId() {
        return courseId;
    }

    public void setCourseId(Object courseId) {
        this.courseId = courseId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", branchName='" + branchName + '\'' +
                ", image='" + image + '\'' +
                ", courseId=" + courseId +
                ", active=" + active +
                '}';
    }
}
