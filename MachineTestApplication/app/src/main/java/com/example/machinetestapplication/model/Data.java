
package com.example.machinetestapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("profile")
    @Expose
    private Profile profile;
    @SerializedName("ads")
    @Expose
    private List<Ad> ads = null;
    @SerializedName("subjects")
    @Expose
    private List<Subject_> subjects = null;
    @SerializedName("demoVideos")
    @Expose
    private List<Object> demoVideos = null;
    @SerializedName("courses")
    @Expose
    private List<Course> courses = null;
    @SerializedName("studentCourse")
    @Expose
    private Object studentCourse;
    @SerializedName("subscribedCourse")
    @Expose
    private List<Object> subscribedCourse = null;
    @SerializedName("subscribedEbooks")
    @Expose
    private List<Object> subscribedEbooks = null;
    @SerializedName("universities")
    @Expose
    private List<University> universities = null;
    @SerializedName("appDetails")
    @Expose
    private Object appDetails;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public List<Subject_> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject_> subjects) {
        this.subjects = subjects;
    }

    public List<Object> getDemoVideos() {
        return demoVideos;
    }

    public void setDemoVideos(List<Object> demoVideos) {
        this.demoVideos = demoVideos;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Object getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(Object studentCourse) {
        this.studentCourse = studentCourse;
    }

    public List<Object> getSubscribedCourse() {
        return subscribedCourse;
    }

    public void setSubscribedCourse(List<Object> subscribedCourse) {
        this.subscribedCourse = subscribedCourse;
    }

    public List<Object> getSubscribedEbooks() {
        return subscribedEbooks;
    }

    public void setSubscribedEbooks(List<Object> subscribedEbooks) {
        this.subscribedEbooks = subscribedEbooks;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public void setUniversities(List<University> universities) {
        this.universities = universities;
    }

    public Object getAppDetails() {
        return appDetails;
    }

    public void setAppDetails(Object appDetails) {
        this.appDetails = appDetails;
    }

}
