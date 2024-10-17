package com.example.domotikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuarioEditText;
    private EditText contrasenaEditText;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculamos las variables a los ids
        usuarioEditText = findViewById(R.id.usuario);
        contrasenaEditText = findViewById(R.id.contrasena);
        spinner = findViewById(R.id.spinnerPaises);

        //añadimos paises al listado
        String[] paises = {"Chile", "Argentina"};
        //declaramos el array y poblamos el spinner como tal
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, paises);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }

   //Funciones para Acceder al sistema
    public void onClickAcceder (View view){

      //Asignamos variables de Usuario y contraseña ademas de pais
        String user = usuarioEditText.getText().toString().trim();
        String pass = contrasenaEditText.getText().toString().trim();
        String pais = spinner.getSelectedItem().toString().trim();
        if (user.isEmpty()){
            Toast.makeText(this, "ingrese el usuario", Toast.LENGTH_SHORT).show();
            return;
        }
        if (pass.isEmpty()){
            Toast.makeText(this, "ingrese la contraseña", Toast.LENGTH_SHORT).show();
            return;
        }

        if(user.equals("o") && pass.equals("1") && pais.equals("Chile")){
            Intent intent = new Intent(this, Users.class);
            startActivity(intent);

        }
        else {

            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }

    }
}