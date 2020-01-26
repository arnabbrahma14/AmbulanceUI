package com.example.ui_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        getSupportActionBar().setTitle("Login");
    }

    public void btn_SignUp(View view) {

        startActivity(new Intent(getApplicationContext(),Sign_Form.class));
    }

    public void btn_Login(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
