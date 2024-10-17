package com.example.domotikapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
    }

    public void onClickFuncion (View view){
        Intent intent = new Intent(this, Itemsjavi.class);
        startActivity(intent);

    }
    public void onClickFuncion2 (View view){
        Intent intent = new Intent(this, Items.class);
        startActivity(intent);

    }
}
