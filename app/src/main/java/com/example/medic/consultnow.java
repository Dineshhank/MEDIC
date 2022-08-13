package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class consultnow extends AppCompatActivity {
    ViewFlipper vflipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultnow);

        int images[] ={R.drawable.img1, R.drawable.medi1, R.drawable.loginbg};
        vflipper = findViewById(R.id.flipper);

        for(int image: images){
            flipperImages(image);
        }

    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        vflipper.addView(imageView);
        vflipper.setFlipInterval(3000);
        vflipper.setAutoStart(true);

        vflipper.setInAnimation(this, android.R.anim.slide_in_left);
        vflipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}