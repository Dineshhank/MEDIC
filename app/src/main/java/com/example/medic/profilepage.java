package com.example.medic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class profilepage extends AppCompatActivity {

    Button mainmenubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);
        this.mainmenubtn = (Button) findViewById(R.id.button6);

        mainmenubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profilepage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}