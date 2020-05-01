package com.example.machinetestapplication.retrofit;

import com.example.machinetestapplication.model.HomeBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HomeService {
    @GET("home")
    Call<HomeBean> getAllHomeData();
}
