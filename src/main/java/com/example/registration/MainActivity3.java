package com.example.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    Button switchTU, switchTD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        switchTU = findViewById(R.id.UploadButton);
        switchTD = findViewById(R.id.DownloadButton);
        switchTU.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                startIntent1();
            }
        });
        switchTD.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                startIntent2();
            }
        });
    }
    private void startIntent1() {
        Intent switchActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(switchActivityIntent);
    }
    private void startIntent2() {
        Intent switchActivityIntent = new Intent(this, MainActivity5.class);
        startActivity(switchActivityIntent);
    }

}