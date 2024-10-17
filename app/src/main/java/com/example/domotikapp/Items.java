package com.example.domotikapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Items extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
    }
    public void onClickAccederConectar (View view){
        Intent intent = new Intent(this, Connect.class);
        startActivity(intent);

    }
    public void onClickAccederUbicacionLando (View view){
        Intent intent = new Intent(this, Maplando.class);
        startActivity(intent);

    }
}
