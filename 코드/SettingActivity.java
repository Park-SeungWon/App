package com.example.bottomex;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_setting);

        //닉네임변경 버튼 클릭시 액티비티 전환
        android.widget.Button button1 = (android.widget.Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SettingActivity2.class);
                startActivity(intent);
            }
        });
        //학교 변경 버튼 클릭시 액티비티 전환
        android.widget.Button button2 = (android.widget.Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SettingActivity3.class);
                startActivity(intent);
            }
        });
        //학년 변경 버튼 클릭시 액티비티 전환
        android.widget.Button button3 = (android.widget.Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SettingActivity4.class);
                startActivity(intent);
            }
        });
    }
}