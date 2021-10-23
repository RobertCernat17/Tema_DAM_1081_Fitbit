package com.example.cernat_robert_fitbit;

import androidx.annotation.Nullable;
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
    private EditText email;
    private EditText pass;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView starttext=(TextView) findViewById(R.id.txt_start);
        starttext.setText("Let's get started");
        email=findViewById(R.id.tb_email);
        pass=findViewById(R.id.tb_pass);
        String email_str=getIntent().getStringExtra("val_email");
        String pass_str=getIntent().getStringExtra("val_pass");
        email.setText(email_str);
        pass.setText(pass_str);


    }





    @Override
    protected void onStart() {
        super.onStart();
        Button btn=findViewById(R.id.btn_log);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fereastra_noua=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(fereastra_noua);
            }
        });
    }
}