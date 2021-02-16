package com.example.practica1_oswarnaal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clic (View vista){
        edNombre = findViewById(R.id.et_name);
        String nombre= String.valueOf(edNombre.getText());
        Toast.makeText(getBaseContext(),"Hola " + nombre,Toast.LENGTH_SHORT).show();
    }
}