package com.example.myfirstapp;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowTextActivity extends AppCompatActivity {

    private ColorList colorSeleccionado;
    private String texto;
    private TextView contenido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);


        contenido = findViewById(R.id.textoMostrado);
        GetParametros();
        MostrarTexto();
    }

    private void MostrarTexto(){
        contenido.setText(texto);

        if(colorSeleccionado == ColorList.Azul)
            contenido.setTextColor(getResources().getColor(R.color.AzulTexto));
        else if (colorSeleccionado == ColorList.Rojo)
            contenido.setTextColor(getResources().getColor(R.color.RojoTexto));
        else
            contenido.setTextColor(getResources().getColor(R.color.AmarilloTexto));

    }

    private void GetParametros(){

        Bundle bundle = getIntent().getExtras();

        colorSeleccionado = ColorList.valueOf(bundle.getString("color"));
        texto = bundle.getString("texto");

    }
}
