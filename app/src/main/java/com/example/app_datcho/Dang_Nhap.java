package com.example.app_datcho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dang_Nhap extends AppCompatActivity {
    TextView txtdk;
    TextView txtqmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        txtdk = (TextView) findViewById(R.id.txtdk);
        txtqmk = (TextView) findViewById(R.id.txtqmk);

    }
}