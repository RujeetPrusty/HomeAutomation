package com.example.homeautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button LightOn,LightOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LightOff = findViewById(R.id.Off);
        LightOn = findViewById(R.id.On);

        LightOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Light_Status");

                myRef.setValue(1);
                Toast.makeText(getApplicationContext(),"sent data 1",Toast.LENGTH_LONG).show();

            }
        });
        LightOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Light_Status");

                myRef.setValue(0);
                Toast.makeText(getApplicationContext(),"sent data 0",Toast.LENGTH_LONG).show();
            }
        });

    }
}
