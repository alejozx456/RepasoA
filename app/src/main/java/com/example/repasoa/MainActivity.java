package com.example.repasoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre1;
    private TextView apellido1;
    private Button mostrar1;
    private String dato2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar1=findViewById(R.id.idButtonCompleto);
        nombre1=findViewById(R.id.idNombrePrimera);
        apellido1=findViewById(R.id.idApellidoRegresado);




        String dato=getIntent().getStringExtra("apellido");
        apellido1.setText(dato);
        dato2=getIntent().getStringExtra("nombrevolver");
        nombre1.setText(dato2);

    }
    //metodo para enviar
    public void Enviar(View view){
        Intent i = new Intent(this,SegundoActivity.class);
        i.putExtra("dato",nombre1.getText().toString());

        startActivity(i);
    }
    public void MostrarNombreC(View view){
        Toast.makeText(this,"Tu te llamas "+dato2+" "+apellido1.getText().toString(),Toast.LENGTH_LONG).show();
    }
}