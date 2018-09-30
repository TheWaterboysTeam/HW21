package edu.fsu.cs.mobile.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    public Button buttonL;
    public Button buttonR;
    public Button buttonT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        buttonL = (Button) findViewById(R.id.button1);
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(myIntent);
            }
        });
        buttonR = (Button) findViewById(R.id.button2);
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(myIntent);
            }
        });
        buttonT = (Button) findViewById(R.id.button3);
        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(myIntent);
            }
        });
    }




}

