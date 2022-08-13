package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class general extends AppCompatActivity {
ImageView imgcovid,imgphy,imggyno,imgpedi,imguro,imgent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        this.imgcovid = (findViewById(R.id.imageView));
        this.imgphy = (findViewById(R.id.imageView2));
        this.imggyno = (findViewById(R.id.imageView3));
        this.imgpedi = (findViewById(R.id.imageView4));
        this.imguro = (findViewById(R.id.imageView5));
        this.imgent = (findViewById(R.id.imageView6));


        imgcovid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),consultnow.class);
                intent.putExtra("pass","Covid Consultation");
                general.this.startActivity(intent);
            }
        });

        imgphy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),consultnow.class);
                intent.putExtra("pass","Covid Consultation");
                general.this.startActivity(intent);
            }
        });

        imggyno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),consultnow.class);
                intent.putExtra("pass","Covid Consultation");
                general.this.startActivity(intent);
            }
        });

        imgpedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),consultnow.class);
                intent.putExtra("pass","Covid Consultation");
                general.this.startActivity(intent);
            }
        });

        imguro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),consultnow.class);
                intent.putExtra("pass","Covid Consultation");
                general.this.startActivity(intent);
            }
        });

        imgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),consultnow.class);
                intent.putExtra("pass","Covid Consultation");
                general.this.startActivity(intent);
            }
        });
    }
}