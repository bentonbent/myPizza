package com.example.csmyp7.mypizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }

    public void myOrder(View v){
        Intent order = new Intent(SummaryActivity.this, OrderActivity.class);
        startActivity(order);
    }
}
