package com.arijitpaul.reportcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sectionA_textview = findViewById(R.id.secA);

        sectionA_textview.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SectionA.class);
            startActivity(intent);
        });

        TextView sectionB_textview = findViewById(R.id.secB);

        sectionB_textview.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SectionB.class);
            startActivity(intent);
        });

        TextView sectionC_textview = findViewById(R.id.secC);

        sectionC_textview.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SectionC.class);
            startActivity(intent);
        });

    }
}