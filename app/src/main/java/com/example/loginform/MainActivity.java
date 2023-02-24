package com.example.loginform;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText   ET_Email;
    EditText ET_Password;
    Button btn_login;
    String email = "vhh98@gmail.com";
    String password = "qwert";
    TextView tv_1;
    TextView tv_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_Email = findViewById(R.id.ET_Email);
        ET_Password = findViewById(R.id.ET_Password);
        btn_login = findViewById(R.id.btn_login);
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailInput = ET_Email.getText().toString();
                String passwordInput = ET_Password.getText().toString();

                if (emailInput.length() == 0 || passwordInput.length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui long nhap Email hoac password", Toast.LENGTH_SHORT).show();
                    // Toast.makeText(MainActivity.this, "Ban da dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                } else {
                    if (!emailInput.equals(email) || !passwordInput.equals(password)) {
                        Toast.makeText(MainActivity.this, "Email hoac password khong dung", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Dang Nhap Thanh Cong", Toast.LENGTH_SHORT).show();

                    }
                }
                if (emailInput.equals(email) && passwordInput.equals(password)) {
                    tv_1.setText(ET_Email.getText());
                    tv_2.setText(ET_Password.getText());
                    Intent mh2 = new Intent(MainActivity.this, ManHinh2.class);
                    startActivity(mh2);
                    Bundle bd = new Bundle();
                    bd.putString("key_1", ET_Email.getText().toString());
                    bd.putString("key_2", ET_Password.getText().toString());
                    mh2.putExtra(bd);


                }

            }
        });
    }
}
