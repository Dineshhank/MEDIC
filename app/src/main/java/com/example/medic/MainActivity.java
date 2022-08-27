package com.example.medic;

import static com.example.medic.R.layout.activity_main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ImageView button1, button2;
    ViewFlipper vflipper;
    ImageButton imgbtn;


    //BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        this.button1 = (ImageView) findViewById(R.id.button3);
        this.button2 = (ImageView) findViewById(R.id.button4);
        this.imgbtn = (ImageButton) findViewById(R.id.imageButton);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, general.class);
                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Appoinment.class);
                startActivity(intent);
                finish();
            }
        });

        imgbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, profilepage.class);
                startActivity(intent);
                finish();
            }
        }));



        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadapter);


        int images[] = {R.drawable.slide2, R.drawable.slide3, R.drawable.slide1,R.drawable.banner1};
        vflipper = findViewById(R.id.flippernew);

        for (int image : images) {
            flipperImages(image);

        }
    }

    public void flipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        vflipper.addView(imageView);
        vflipper.setFlipInterval(3000);
        vflipper.setAutoStart(true);

        vflipper.setInAnimation(this, android.R.anim.slide_in_left);
        vflipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}