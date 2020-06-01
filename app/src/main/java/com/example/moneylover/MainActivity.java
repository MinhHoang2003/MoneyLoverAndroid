package com.example.moneylover;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button logInBtn, logInGmailBtn, signUpBtn;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setOnClickLogInButton();
        setOnClickLogInGmailButton();
        setOnClickSignUpButton();
        setOnTextChangeEditTexts();
    }

    private void setupViews() {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        logInBtn = findViewById(R.id.logInBtn);
        logInGmailBtn = findViewById(R.id.logInGmailBtn);
        signUpBtn = findViewById(R.id.signUpBtn);
    }

    private void setOnClickLogInButton() {
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void setOnClickLogInGmailButton() {
        logInGmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void setOnClickSignUpButton() {
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.moneylover.SignUpView.class);
                startActivity(intent);
            }
        });
    }

    private void setOnTextChangeEditTexts() {
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    logInBtn.setEnabled(false);
                } else {
                    logInBtn.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    logInBtn.setEnabled(false);
                } else {
                    logInBtn.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
