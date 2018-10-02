package com.example.marco.pedido_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class confirmacionPedido extends AppCompatActivity {
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_pedido);
        tv1= (TextView)findViewById(R.id.textView6);

    tipoComida1 tc1= new tipoComida1();
        /*int tx3= Integer.parseInt(tc1.tx1);
        int tx4= Integer.parseInt(tc1.tx2);
        int tx3= 3;
        int tx4= 2;*/
            tv1.setText(Integer.toString(tc1.tx1 + tc1.tx2));


    }

}
