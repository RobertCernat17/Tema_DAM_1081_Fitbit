package com.example.cernat_robert_fitbit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    CheckBox cb_terms;
    CheckBox cb_learn;
    EditText email;
    EditText pass;
    private final int mainactivityRequest=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String text_terms="I agree to the Fitbit Terms of Service.";
                String text_terms2="Please also read the Privacy Policy,";
        String text_term3="including the Cookie Use statement";

        SpannableString tt_n=new SpannableString(text_terms);
        SpannableString tt_1=new SpannableString(text_terms2);
        SpannableString tt_2=new SpannableString(text_term3);
        UnderlineSpan subliniere=new UnderlineSpan();
        UnderlineSpan subliniere2=new UnderlineSpan();
        UnderlineSpan subliniere3=new UnderlineSpan();
        tt_n.setSpan(subliniere,22,39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tt_1.setSpan(subliniere2,21,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tt_2.setSpan(subliniere3,14,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ForegroundColorSpan fcalb=new ForegroundColorSpan(Color.WHITE);
        ForegroundColorSpan fcalb2=new ForegroundColorSpan(Color.WHITE);
        ForegroundColorSpan fcalb3=new ForegroundColorSpan(Color.WHITE);
        tt_n.setSpan(fcalb,22,39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tt_1.setSpan(fcalb2,21,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tt_2.setSpan(fcalb3,14,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        String text_learn="I agree to the transfer of my personal data to the United States and other countries with different data protection laws. Learn more";
        SpannableString tt_n2=new SpannableString(text_learn);
        tt_n2.setSpan(fcalb,90,132, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        UnderlineSpan subliniere4=new UnderlineSpan();
        tt_n2.setSpan(subliniere4,90,132, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

         cb_terms=findViewById(R.id.cb_termspolicy);
        cb_terms.setText(TextUtils.concat(tt_n,tt_1,tt_2));
        cb_learn=findViewById(R.id.cb_protection);
        cb_learn.setText(tt_n2);

    }
    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
    @Override
    protected void onStart() {
        super.onStart();
        Button btn_next=findViewById(R.id.btnnext);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validare())
                {
                    email=findViewById(R.id.tb_email2);
                    pass=findViewById(R.id.tb_pass2);
                    String email_str=email.getText().toString();
                    String pass_str=pass.getText().toString();
                    Cont cont_nou=new Cont();
                    cont_nou.setEmail(email.getText().toString());
                    cont_nou.setPassword(pass.getText().toString());
                    Intent intent=new Intent(MainActivity4.this,MainActivity.class);
                    intent.putExtra("val_email",email_str);
                    intent.putExtra("val_pass",pass_str);
                    startActivity(intent);


                }
            }
        });
    }
    private boolean validare()
    {
         email=findViewById(R.id.tb_email2);
        pass=findViewById(R.id.tb_pass2);
        if(!isValidEmail(email.getText().toString()))
        {

            Toast.makeText(MainActivity4.this,"Completati email corect!",Toast.LENGTH_LONG).show();
            return false;
        }
        if(email.getText().toString().isEmpty())
        {
            Toast.makeText(MainActivity4.this,"Completati email!",Toast.LENGTH_LONG).show();
            return false;
        }
        if(pass.getText().toString().isEmpty())
        {
        Toast.makeText(MainActivity4.this,"Completati parola!",Toast.LENGTH_LONG).show();
            return false;
        }
        if(!cb_learn.isChecked() || !cb_terms.isChecked())
        {

            Toast.makeText(MainActivity4.this,"Trebuie sa acceptati Conditiile!",Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}