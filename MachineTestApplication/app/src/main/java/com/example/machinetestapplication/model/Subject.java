
package com.example.machinetestapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subject {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("semester")
    @Expose
    private Object semester;
    @SerializedName("subjectName")
    @Expose
    private Object subjectName;
    @SerializedName("year")
    @Expose
    private Object year;
    @SerializedName("branchId")
    @Expose
    private Object branchId;
    @SerializedName("branch")
    @Expose
    private Object branch;
    @SerializedName("count")
    @Expose
    private Object count;
    @SerializedName("courseName")
    @Expose
    private String courseName;
    @SerializedName("notes")
    @Expose
    private Object notes;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("price")
    @Expose
    private Object price;
    @SerializedName("receiptId")
    @Expose
    private Object receiptId;
    @SerializedName("releasingOn")
    @Expose
    private Object releasingOn;
    @SerializedName("common")
    @Expose
    private Boolean common;
    @SerializedName("createdDateTime")
    @Expose
    private Object createdDateTime;
    @SerializedName("updatedDateTime")
    @Expose
    private Object updatedDateTime;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getSemester() {
        return semester;
    }

    public void setSemester(Object semester) {
        this.semester = semester;
    }

    public Object getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(Object subjectName) {
        this.subjectName = subjectName;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public Object getBranchId() {
        return branchId;
    }

    public void setBranchId(Object branchId) {
        this.branchId = branchId;
    }

    public Object getBranch() {
        return branch;
    }

    public void setBranch(Object branch) {
        this.branch = branch;
    }

    public Object getCount() {
        return count;
    }

    public void setCount(Object count) {
        this.count = count;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Object getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Object receiptId) {
        this.receiptId = receiptId;
    }

    public Object getReleasingOn() {
        return releasingOn;
    }

    public void setReleasingOn(Object releasingOn) {
        this.releasingOn = releasingOn;
    }

    public Boolean getCommon() {
        return common;
    }

    public void setCommon(Boolean common) {
        this.common = common;
    }

    public Object getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Object createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Object getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Object updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

}
