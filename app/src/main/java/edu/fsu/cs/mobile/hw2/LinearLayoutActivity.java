package edu.fsu.cs.mobile.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout2);

        Spinner mySpinner = (Spinner)  findViewById(R.id.dept_spinner);

        ArrayAdapter<CharSequence> adapter =
               ArrayAdapter.createFromResource(this,  R.array.departments_array,  android.R.layout.simple_spinner_item);

        mySpinner.setAdapter(adapter);

    }
}
