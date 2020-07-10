package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("page3","Page3回傳");
        setResult(3,intent);
        super.finish();
    }
}