package com.example.bottomex;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.bottomex.Fragment.FragMypage;
import com.example.bottomex.Fragment.FragHome;
import com.example.bottomex.Fragment.FragSelect;
import com.example.bottomex.Fragment.FragSetting;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    // 바텀 네비게이션
    BottomNavigationView bottomNavigationView;

    private String TAG = "메인";

    // 프래그먼트 변수
    Fragment fragment_home;
    Fragment fragment_setting;
    Fragment fragment_mypage;
    Fragment fragment_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 프래그먼트 생성
        fragment_home = new FragHome();
        fragment_setting = new FragSetting();
        fragment_mypage = new FragMypage();
        fragment_select = new FragSelect();


        // 바텀 네비게이션
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // 초기 플래그먼트 설정
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment_home).commitAllowingStateLoss();


        // 바텀 네비게이션
        bottomNavigationView = findViewById(R.id.bottomNavigationView);


        // 리스너 등록
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.i(TAG, "바텀 네비게이션 클릭");

                switch (item.getItemId()){
                    case R.id.home:
                        Log.i(TAG, "home 들어옴");
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout,fragment_home).commitAllowingStateLoss();
                        return true;
                    case R.id.star:
                        Log.i(TAG, "setting 들어옴");
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout,fragment_setting).commitAllowingStateLoss();
                        return true;
                    case R.id.group:
                        Log.i(TAG, "select 들어옴");
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout,fragment_mypage).commitAllowingStateLoss();
                        return true;
                    case R.id.hotel:
                        Log.i(TAG, "mypage 들어옴");
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout,fragment_select).commitAllowingStateLoss();
                        return true;
                }
                return true;
            }
        });




    }
}