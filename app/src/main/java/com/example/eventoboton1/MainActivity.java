package com.example.eventoboton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Paso 1. Creo mis variables para almacenar los valores y eventos de los Views
    private Button btnHola;
    private TextView txtSaludo;
    private EditText txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Paso 2. Instancio la variable con el valor que recoge la GUI
        //Nota: Hacerle casting o conversion de tipo.
        btnHola = (Button) findViewById(R.id.hola);
        txtSaludo = (TextView) findViewById(R.id.saludo);
        txtname = (EditText) findViewById(R.id.name);

        //Segunda Forma: Manejando los eventos manualmente
        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtname.getText().toString();
                txtSaludo.setText("HOLA "+nombre);
            }
        });
    }

    //Paso 3. Metodo del boton (Esto se va a ejecutar cuando se presione el boton)
    /*public void saludar(View view)
    {
    txtSaludo.setText("HOLA MUNDO");
    }*/

}