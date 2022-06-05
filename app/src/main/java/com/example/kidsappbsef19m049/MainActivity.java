package com.example.kidsappbsef19m049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button repo, learn, quiz;
    ListView mainScreenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainScreenList = (ListView) findViewById(R.id.ListViewMainScreen);
        ArrayList<String> MainScreenList = new ArrayList<String>();
        MainScreenList.add("REPO");
        MainScreenList.add("LEARN");
        MainScreenList.add("QUIZ");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,MainScreenList);
        mainScreenList.setAdapter(arrayAdapter);

        mainScreenList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Hanzala-Iqbal/KIDS-SIX-KALMA-APP-BSEF19M049/tree/master")));
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this,Six_Kalmas.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    startActivity(intent);
                }


            }
        });

    }

}