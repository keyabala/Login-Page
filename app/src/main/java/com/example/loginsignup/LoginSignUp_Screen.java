package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LoginSignUp_Screen extends AppCompatActivity {

    LinearLayout login_ll,sign_up_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up__screen);
        login_ll = findViewById(R.id.login_ll);
        sign_up_ll = findViewById(R.id.sign_up_ll);
    }

    public void loginBtn(View view) {
        sign_up_ll.setVisibility(View.VISIBLE);
        login_ll.setVisibility(View.GONE);
    }

    public void signUp(View view) {
        sign_up_ll.setVisibility(View.GONE);
        login_ll.setVisibility(View.VISIBLE);

    }
}