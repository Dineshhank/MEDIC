package com.example.medic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView txtSignUp;
    Button btnlogin;
    EditText etuser,etpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        txtSignUp = findViewById(R.id.txtSignUp);

        this.btnlogin=(Button)findViewById(R.id.btnSignIn);
        this.etuser = (EditText)findViewById(R.id.edtSignInEmail);
        this.etpass = (EditText)findViewById(R.id.edtSignInPassword);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               LoginActivity lg = LoginActivity.this;
               lg.validate(lg.etuser.getText().toString(),LoginActivity.this.etpass.getText().toString());
//                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
            }
        });


        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void validate(String username, String password){
        boolean equals = username.equals("");
        //String str = BuildConfig.BUILD_TYPE;
        if (equals &&  password.equals("")){
            this.etuser.setText("");
            this.etpass.setText("");
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            return;
        }
        Toast.makeText(getApplicationContext(),"Login Failed", Toast.LENGTH_LONG).show();
        this.etuser.setText("");
        this.etpass.setText("");


    }
}