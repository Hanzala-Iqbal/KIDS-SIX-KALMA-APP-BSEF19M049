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

import java.util.ArrayList;

public class Six_Kalmas extends AppCompatActivity {

    ListView sixKalmaScreenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_kalmas);

        sixKalmaScreenList = (ListView) findViewById(R.id.sixKalmaList);
        ArrayList<String> KalmaList = new ArrayList<String>();
        KalmaList.add("FIRST KALMA");
        KalmaList.add("SECOND KALMA");
        KalmaList.add("THIRD KALMA");
        KalmaList.add("FOURTH KALMA");
        KalmaList.add("FIFTH KALMA");
        KalmaList.add("SIXTH KALMA");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,KalmaList);
        sixKalmaScreenList.setAdapter(arrayAdapter);

        sixKalmaScreenList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    changeActivity1();
                }
                if (position == 1) {
                    changeActivity2();
                }
                if (position == 2) {
                    changeActivity3();
                }
                if (position == 3) {
                    changeActivity4();
                }
                if (position == 4) {
                    changeActivity5();
                }
                if (position == 5) {
                    changeActivity6();
                }
            }
        });
    }

    private void changeActivity1()
    {
        Intent intent = new Intent(this,First_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity2()
    {
        Intent intent = new Intent(this,Second_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity3()
    {
        Intent intent = new Intent(this, Third_Kalma.class);
        startActivity(intent);
    }
     private void changeActivity4()
    {
        Intent intent = new Intent(this, Fourth_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity5()
    {
        Intent intent = new Intent(this, Fifth_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity6()
    {
        Intent intent = new Intent(this, Sixth_Kalma.class);
        startActivity(intent);
    }

}