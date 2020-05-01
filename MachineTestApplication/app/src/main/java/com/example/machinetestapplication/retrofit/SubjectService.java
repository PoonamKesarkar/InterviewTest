package com.example.machinetestapplication.retrofit;

import com.example.machinetestapplication.model.SubjectBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SubjectService {
    @GET("/api/v1/subjects")
    Call<SubjectBean> getAllSubjectData();
}
