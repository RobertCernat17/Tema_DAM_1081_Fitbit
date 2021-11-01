package com.example.cernat_robert_fitbit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText pass;
    private Button btn_log;
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
        btn_log=findViewById(R.id.btn_log1);
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Lista_Produse.class);
                startActivity(intent);

            }
        });

    }





    @Override
    protected void onStart() {
        super.onStart();
        Button btn=findViewById(R.id.btn_log1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fereastra_noua=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(fereastra_noua);
            }
        });
    }
}