package com.example.lecture8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        Log.d("Checking",intent.getStringExtra("Friend Name"));
        textView.setText(intent.getStringExtra("Friend Name"));
    }
}