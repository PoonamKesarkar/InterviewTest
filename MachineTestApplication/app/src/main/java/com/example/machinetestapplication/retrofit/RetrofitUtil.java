package com.example.machinetestapplication.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.machinetestapplication.util.Constant.homeUrl;

public class RetrofitUtil {
    private static Retrofit retrofit = null;
    private static RetrofitUtil retrofitUtilInstance;

    private RetrofitUtil() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(homeUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public static synchronized RetrofitUtil getInstance() {
        if (retrofitUtilInstance == null)
            retrofitUtilInstance = new RetrofitUtil();
        return retrofitUtilInstance;
    }
    public Retrofit getRetrofit(){
        return retrofit;
    }
}
