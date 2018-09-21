package com.t3ch.shaj.android_spinner_dropdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] planetNames;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetNames = getResources().getStringArray(R.array.planet_names);

        spinner = findViewById(R.id.SpinnerID);
        textView = findViewById(R.id.TV_ID);
        button = findViewById(R.id.showButtonID);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample_layout, R.id.sampleTVid, planetNames);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });

    }
}
