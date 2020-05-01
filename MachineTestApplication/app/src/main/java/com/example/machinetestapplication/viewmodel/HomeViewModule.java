package com.example.machinetestapplication.viewmodel;

import android.util.Log;

import com.example.machinetestapplication.model.HomeBean;
import com.example.machinetestapplication.retrofit.HomeService;
import com.example.machinetestapplication.retrofit.RetrofitUtil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModule extends ViewModel {
    String TAG = this.getClass().getName();
    MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    MutableLiveData<Boolean> isError = new MutableLiveData<>();
    MutableLiveData<HomeBean> hometBeanMutableLiveData = new MutableLiveData<>();
    Call<HomeBean> apiCalUser;
    private HomeService homeService;

    public LiveData<Boolean> error() {
        Log.d(TAG, "return isError  : " + isError);
        return isError;
    }

    public LiveData<HomeBean> homeDataReceived() {
        Log.d(TAG, "return onHomeDataReceive  : " + hometBeanMutableLiveData);
        return hometBeanMutableLiveData;
    }

    public LiveData<Boolean> isLoading() {
        Log.d(TAG, "return isLoading  : " + isLoading);
        return isLoading;
    }

   public void getHomeData(){
       homeService = RetrofitUtil.getInstance().getRetrofit().create(HomeService.class);
        isLoading.setValue(true);
        apiCalUser = homeService.getAllHomeData();
        Log.d(TAG, "Start getHome call 2 : ");

        apiCalUser.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                Log.d(TAG, " getHome call onResponse 0 : ");

                if (response.body() != null)
                    Log.d(TAG, " getHomeByID call onResponse 1 : " + response.body().toString());


                if (response.code() == 200 && response.body() != null) {
                    Log.d(TAG, " getHome call onResponse 2 : " + response.body().toString());

                    isError.setValue(false);
                    hometBeanMutableLiveData.setValue(response.body());

                } else {
                    isError.setValue(true);
                    hometBeanMutableLiveData.setValue(null);
                }
                isLoading.setValue(false);
                apiCalUser = null;

            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {
                Log.d(TAG, " getHome call onFailure : " + t.toString());
                isError.setValue(true);
                isLoading.setValue(false);
                apiCalUser = null;
            }

        });

    }
}
