
package com.example.machinetestapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Course {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("year")
    @Expose
    private Object year;
    @SerializedName("semester")
    @Expose
    private Object semester;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("uniId")
    @Expose
    private Long uniId;
    @SerializedName("uniName")
    @Expose
    private String uniName;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("branches")
    @Expose
    private Object branches;
    @SerializedName("createdDateTime")
    @Expose
    private String createdDateTime;
    @SerializedName("updatedDateTime")
    @Expose
    private String updatedDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public Object getSemester() {
        return semester;
    }

    public void setSemester(Object semester) {
        this.semester = semester;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getUniId() {
        return uniId;
    }

    public void setUniId(Long uniId) {
        this.uniId = uniId;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getBranches() {
        return branches;
    }

    public void setBranches(Object branches) {
        this.branches = branches;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

}
