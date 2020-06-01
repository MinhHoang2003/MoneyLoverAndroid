package com.example.moneylover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddTransactionView extends AppCompatActivity {

    EditText noteEt, moneyEt;
    TextView categoryTv, dateTv, walletTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);

        setupViews();
        setOnClickCategoryTv();
        setOnClickDateTv();
        setOnClickWalletPt();
    }

    private void setupViews() {
        noteEt = findViewById(R.id.noteEt);
        moneyEt = findViewById(R.id.moneyEt);
        categoryTv = findViewById(R.id.categoryPt);
        dateTv = findViewById(R.id.datePt);
        walletTv = findViewById(R.id.walletPt);
    }

    private void setOnClickCategoryTv() {
        categoryTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void setOnClickDateTv() {
        dateTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void setOnClickWalletPt() {
        walletTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
