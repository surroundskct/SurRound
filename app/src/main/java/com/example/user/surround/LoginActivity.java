package com.example.user.surround;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.user.surround.MainActivity.mAuth;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText userName, password;
    Button btnLogin, btnSignup;

    String strUserName, strPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (TextInputEditText) findViewById(R.id.loginDetailsEditText);
        password = (TextInputEditText) findViewById(R.id.loginPasswordEditText);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strUserName = userName.getText().toString();
                strPassword = password.getText().toString();
                Toast.makeText(getApplicationContext(), strPassword+strUserName, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
