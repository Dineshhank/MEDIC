package com.example.medic;

import static com.example.medic.R.layout.activity_main;
import static com.example.medic.R.layout.activity_sign_up;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button1,button2;


    //BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(activity_main);
       this.button1=(Button) findViewById(R.id.button3);
       this.button2=(Button) findViewById(R.id.button3);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, general.class);
               startActivity(intent);
               finish();
           }
       });


    }
}