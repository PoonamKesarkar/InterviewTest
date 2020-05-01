package com.example.machinetestapplication.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.machinetestapplication.R;
import com.example.machinetestapplication.adapter.BranchAdapter;
import com.example.machinetestapplication.adapter.UniversityAdapter;
import com.example.machinetestapplication.databinding.ActivityMainBinding;
import com.example.machinetestapplication.model.Branch;
import com.example.machinetestapplication.model.Data;
import com.example.machinetestapplication.model.HomeBean;
import com.example.machinetestapplication.model.SubjectBean;
import com.example.machinetestapplication.model.University;
import com.example.machinetestapplication.viewmodel.HomeViewModule;
import com.example.machinetestapplication.viewmodel.SubjectViewModel;

import java.util.ArrayList;
import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    HomeViewModule modelHome;
    SubjectViewModel subjectViewModel;
    String TAG = this.getClass().getName();
    private ActivityMainBinding activityMainBinding;
    private TextView txtTimeMessage;
    private RecyclerView recyclerBranchList,recyclerUnivercityList;
    private ArrayList<Branch> list;
    private ArrayList<University> universitylist;
    private BranchAdapter adapter;
    private UniversityAdapter universityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(activityMainBinding.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Dashboard");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        activityMainBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        init();
    }

    private void init() {
        txtTimeMessage = activityMainBinding.txtTimeMessage;
        recyclerBranchList = activityMainBinding.recyclerBranchList;
        recyclerUnivercityList = activityMainBinding.recyclerUnivercityList;
        recyclerBranchList.setHasFixedSize(true);
        list = new ArrayList<>();
        adapter = new BranchAdapter(this, list);
        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerBranchList.setLayoutManager(horizontalLayoutManagaer);
        recyclerBranchList.setAdapter(adapter);

        universitylist = new ArrayList<>();
        universityAdapter = new UniversityAdapter(this, universitylist);
        LinearLayoutManager verticalLayoutManagaer = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerUnivercityList.setLayoutManager(verticalLayoutManagaer);
        recyclerUnivercityList.setAdapter(universityAdapter);
        loadHomeApiData();
        loadSubjectData();
        showTimeMessage();
    }

    private void showTimeMessage() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if (timeOfDay >= 0 && timeOfDay < 12) {
            txtTimeMessage.setText("Good Morning");
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            txtTimeMessage.setText("Good Afternoon");
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            txtTimeMessage.setText("Good Evening");
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            txtTimeMessage.setText("Good Night");
        } else {
            txtTimeMessage.setVisibility(View.GONE);
        }
    }

    private void loadSubjectData() {
        subjectViewModel = new ViewModelProvider(MainActivity.this).get(SubjectViewModel.class);
        subjectViewModel.getSubjectData();
        final ProgressDialog pd = new ProgressDialog(this);

        subjectViewModel.error().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if (aBoolean)
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();

            }
        });
        subjectViewModel.isLoading().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                Log.d(TAG, "isLoading aBoolean " + aBoolean);
                if(aBoolean){
                    pd.setMessage("Loading.....");
                    pd.show();
                }else{
                    pd.dismiss();
                }

            }
        });
        subjectViewModel.onSubjectReceived().observe(this, new Observer<SubjectBean>() {
            @Override
            public void onChanged(SubjectBean SubjectBean) {
                list.addAll(SubjectBean.getData());
                Log.d("TAG", "list:" + list.size());
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void loadHomeApiData() {

        modelHome = new ViewModelProvider(MainActivity.this).get(HomeViewModule.class);
        modelHome.getHomeData();
        modelHome.error().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                Log.d(TAG, "error aBoolean " + aBoolean);
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();


            }
        });
        modelHome.isLoading().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                Log.d(TAG, "isLoading aBoolean " + aBoolean);

            }
        });
        modelHome.homeDataReceived().observe(this, new Observer<HomeBean>() {
            @Override
            public void onChanged(HomeBean hometBean) {
                Log.d(TAG, "homeBean " + hometBean.toString());
                Data homeData=hometBean.getData();
                if(homeData!=null){
                    universitylist.addAll(homeData.getUniversities());
                }
                universityAdapter.notifyDataSetChanged();

            }
        });

    }
}
