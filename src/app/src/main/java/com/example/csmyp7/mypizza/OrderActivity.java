package com.example.csmyp7.mypizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void mySummary(View v){
        Intent summary = new Intent(OrderActivity.this, SummaryActivity.class);
        startActivity(summary);
    }

   // public String myOrderSummary()

}
