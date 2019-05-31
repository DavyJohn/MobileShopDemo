package com.example.zahi.mobileshop.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.zahi.mobileshop.R;
import com.example.zahi.mobileshop.fragment.NaviationFragment;


public class MainActivity extends AppCompatActivity {
    private NaviationFragment naviationFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        naviationFragment = new NaviationFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.main_frame,naviationFragment).commit();


    }
}
