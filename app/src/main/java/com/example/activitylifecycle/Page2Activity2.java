package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page2Activity2 extends AppCompatActivity {
    private TextView tBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Intent intent = getIntent();
        int BMI = intent.getIntExtra("BMI",-1);
        tBMI = findViewById(R.id.BMI);
        tBMI.setText(BMI);
    }

    public void Page2(View view) {
        Intent intent = new Intent();
        intent.putExtra("page2","page2回傳");
        setResult(2,intent);
        finish();
    }
}