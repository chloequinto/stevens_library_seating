package com.example.libseats3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button third_floor_button, first_floor_button,second_floor_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        third_floor_button = (Button) findViewById(R.id.third_floor);
        third_floor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdintent = new Intent(MainActivity.this, Map_Third_Floor_Activity.class);
                startActivity(thirdintent);
            }
        });

        first_floor_button = (Button) findViewById(R.id.first_floor);
        first_floor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstintent = new Intent(MainActivity.this, map_first_floor.class);
                startActivity(firstintent);
            }
        });

      second_floor_button = (Button) findViewById(R.id.second_floor);
        second_floor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondintent = new Intent(MainActivity.this, map_second_floor.class);
                startActivity(secondintent);
            }
        });
    }
}
