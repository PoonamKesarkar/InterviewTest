package com.example.machinetestapplication.viewmodel;

import android.util.Log;

import com.example.machinetestapplication.model.SubjectBean;
import com.example.machinetestapplication.retrofit.RetrofitUtil;
import com.example.machinetestapplication.retrofit.SubjectService;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SubjectViewModel extends ViewModel {
    String TAG = this.getClass().getName();
    MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    MutableLiveData<Boolean> isError = new MutableLiveData<>();
    MutableLiveData<SubjectBean> subjectBeanMutableLiveData = new MutableLiveData<>();
    Call<SubjectBean> apiCalUser;
    private SubjectService homeService;

    public LiveData<Boolean> error() {
        Log.d(TAG, "return isError  : " + isError);
        return isError;
    }

    public LiveData<SubjectBean> onSubjectReceived() {
        Log.d(TAG, "return onSubjectReceive  : " + subjectBeanMutableLiveData);
        return subjectBeanMutableLiveData;
    }

    public LiveData<Boolean> isLoading() {
        Log.d(TAG, "return isLoading  : " + isLoading);
        return isLoading;
    }

    public void getSubjectData() {
        homeService = RetrofitUtil.getInstance().getRetrofit().create(SubjectService.class);
        isLoading.setValue(true);
        apiCalUser = homeService.getAllSubjectData();
        Log.d(TAG, "Start getSubject call 2 : ");

        apiCalUser.enqueue(new Callback<SubjectBean>() {
            @Override
            public void onResponse(Call<SubjectBean> call, Response<SubjectBean> response) {
                Log.d(TAG, " getSubject call onResponse 0 : ");

                if (response.body() != null)
                    Log.d(TAG, " getSubject call onResponse 1 : " + response.body().toString());


                if (response.code() == 200 && response.body() != null) {
                    Log.d(TAG, " getSubject call onResponse 2 : " + response.body().toString());

                    isError.setValue(false);
                    subjectBeanMutableLiveData.setValue(response.body());

                } else {
                    isError.setValue(true);
                    subjectBeanMutableLiveData.setValue(null);
                }
                isLoading.setValue(false);
                apiCalUser = null;

            }

            @Override
            public void onFailure(Call<SubjectBean> call, Throwable t) {
                Log.d(TAG, " getSubjectBean call onFailure : " + t.toString());
                isError.setValue(true);
                isLoading.setValue(false);
                apiCalUser = null;
            }

        });

    }
}
