package com.example.cernat_robert_fitbit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView starttext=(TextView) findViewById(R.id.txt_start);
        starttext.setText("Let's get started");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Button btn=findViewById(R.id.btn_log);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fereastra_noua=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(fereastra_noua);
            }
        });
    }
}