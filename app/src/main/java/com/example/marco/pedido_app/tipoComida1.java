package com.example.marco.pedido_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tipoComida1 extends AppCompatActivity {
    Button mbutton;
    EditText mEditext1, mEditext2;
    int tx1, tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_comida1);

        mbutton = (Button)findViewById(R.id.button3);
        mEditext1   = (EditText)findViewById(R.id.editText2);
        mEditext2   = (EditText)findViewById(R.id.editText3);

        mbutton.setOnClickListener(new View.OnClickListener()
                {

                    public void onClick(View view1)
                    {
                       tx1= Log.v("EditText", mEditext1.getText().toString());
                        tx2= Log.v("EdiTex2",mEditext2.getText().toString());
                        Intent intent= new Intent(tipoComida1.this,MainActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
