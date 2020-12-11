package com.example.googlemaptask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button location_button_id;
    Button diections_button_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        location_button_id = findViewById(R.id.location_button_id);
        diections_button_id = findViewById(R.id.diections_button_id);

        location_button_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MyLocationClass.class);
                startActivity(intent);
            }
        });
        diections_button_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapDirectionActivity.class);
                startActivity(intent);
            }
        });
    }
}