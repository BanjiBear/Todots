package com.example.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText pas, usr;
    Button switchTR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        usr = (EditText) findViewById(R.id.username);
        pas = (EditText) findViewById(R.id.password);
        switchTR = findViewById(R.id.RegisButton);
        switchTR.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                startIntent();
            }
        });
    }
    private void startIntent() {
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }
    public void login(View view) {
        String user = usr.getText().toString();
        String pass = pas.getText().toString();
        background2 bg = new background2(this);
        bg.execute(user,pass);
        usr.setText("");
        pas.setText("");
    }
}
