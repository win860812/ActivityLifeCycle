package com.example.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Page2(View view) {
        Intent intent = new Intent(this,Page2Activity2.class);
        intent.putExtra("BMI",25);
        startActivityForResult(intent,2);
    }

    public void Page3(View view) {
        Intent intent = new Intent(this,page3.class);
        startActivityForResult(intent,3);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == 2)
        {
            String Page2Value = data.getStringExtra("page2");
            Log.v("test",Page2Value);
        }
        else
        {
            String Page3Value = data.getStringExtra("page3");
            Log.v("test",Page3Value);
        }


    }


}