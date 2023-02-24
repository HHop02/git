package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManHinh2 extends AppCompatActivity {
    Button btnBackToMh1;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        Bundle bd = getIntent().getExtras();
        if(bd!=null){
            String email, password;
            email = bd.getString("key_1","sai key");
            password = bd.getString("key_2","sai key");
            txt1.setText(email);
            txt2.setText(password);
        }

        btnBackToMh1 = (Button) findViewById(R.id.btnBackToMh1);
        btnBackToMh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh1= new Intent( ManHinh2.this , MainActivity.class);
                startActivity(mh1);
            }
        });
    }
}