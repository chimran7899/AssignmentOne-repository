package com.example.mcsf19a048_assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abc(View view) {
        Intent intent = new Intent(this, english.class);
        startActivity(intent);
    }

    public void counting(View view) {
        Intent intent = new Intent(this,counting.class);
        startActivity(intent);

    }
}