package com.example.kidsappbsef19m049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button repo, learn, quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repo = findViewById(R.id.repobtn);
        learn = findViewById(R.id.learnbtn);
        quiz = findViewById(R.id.quizbtn);

        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "REPO!", Toast.LENGTH_SHORT).show();
            }
        });

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
    }
        private void changeActivity()
        {
            Intent intent = new Intent(this,Six_Kalmas.class);
            startActivity(intent);
        }




}