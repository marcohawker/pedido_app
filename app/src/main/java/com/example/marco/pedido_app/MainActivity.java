package com.example.marco.pedido_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton1, boton2, boton3, boton4, boton5, boton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1= (Button) findViewById(R.id.button11);
        boton2= (Button) findViewById(R.id.button10);
        boton3= (Button) findViewById(R.id.button9);
        boton4= (Button) findViewById(R.id.button8);
        boton5= (Button) findViewById(R.id.button7);
        boton6= (Button) findViewById(R.id.button6);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button11:
                Intent intent= new Intent(MainActivity.this,tipoComida1.class);
                startActivity(intent);
                break;
            case R.id.button10:
                Intent intent2= new Intent(MainActivity.this,tipoComida1.class);
                startActivity(intent2);
                break;
            case R.id.button9:
                Intent intent3= new Intent(MainActivity.this,tipoComida1.class);
                startActivity(intent3);
                break;
            case R.id.button8:
                Intent intent4= new Intent(MainActivity.this,tipoComida1.class);
                startActivity(intent4);
                break;
            case R.id.button7:
                Intent intent5= new Intent(MainActivity.this,tipoComida1.class);
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6= new Intent(MainActivity.this,confirmacionPedido.class);
                startActivity(intent6);
                break;

        }

    }
}
