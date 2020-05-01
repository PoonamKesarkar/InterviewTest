
package com.example.machinetestapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subject_ {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("semester")
    @Expose
    private Long semester;
    @SerializedName("subjectName")
    @Expose
    private String subjectName;
    @SerializedName("year")
    @Expose
    private Long year;
    @SerializedName("branchId")
    @Expose
    private Long branchId;
    @SerializedName("branch")
    @Expose
    private String branch;
    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("courseName")
    @Expose
    private Object courseName;
    @SerializedName("notes")
    @Expose
    private Object notes;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("price")
    @Expose
    private Long price;
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
    private String createdDateTime;
    @SerializedName("updatedDateTime")
    @Expose
    private String updatedDateTime;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSemester() {
        return semester;
    }

    public void setSemester(Long semester) {
        this.semester = semester;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Object getCourseName() {
        return courseName;
    }

    public void setCourseName(Object courseName) {
        this.courseName = courseName;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
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

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

}
