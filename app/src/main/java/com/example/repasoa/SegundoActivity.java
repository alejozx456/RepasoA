package com.example.repasoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {


    private TextView nombre2;
    private EditText apellido2;
    private Button mostrar2;
    private String dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        nombre2=findViewById(R.id.idNombreSegunda);
        mostrar2=findViewById(R.id.idButtonCompleto);
         dato=getIntent().getStringExtra("dato");
        nombre2.setText("Hola "+ dato);

        apellido2=findViewById(R.id.idNombreRegresarSegunda);



    }
    //metodo para regresar
    public void RegresarAmain(View view){
        Intent r=new Intent(this,MainActivity.class);
        r.putExtra("apellido",apellido2.getText().toString());
        r.putExtra("nombrevolver",dato);
        //mostrar2.setEnabled(true);
        startActivity(r);
        //mostrar2.setVisibility(view.VISIBLE);

    }
}