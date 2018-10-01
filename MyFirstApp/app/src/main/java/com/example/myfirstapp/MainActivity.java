package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity   {

    private CheckBox cAzul;
    private CheckBox cAmarillo;
    private CheckBox cRojo;
    private ColorList color;
    private EditText tContenido;
    private Button bPintar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cAzul = findViewById(R.id.checkAzul);
        this.cAmarillo = findViewById(R.id.checkAmarillo);
        this.cRojo = findViewById(R.id.checkRojo);

        this.bPintar = findViewById(R.id.bPintar);
        this.tContenido = findViewById(R.id.tContenido);

        this.cAzul.setOnClickListener(checkedAzul);
        this.cRojo.setOnClickListener(checkedRojo);
        this.cAmarillo.setOnClickListener(checkedAmarillo);

        this.bPintar.setOnClickListener(pintarTexto);

    }


    View.OnClickListener checkedAzul = new View.OnClickListener() {
        public void onClick(View v) {
            cAzul.setChecked(true);
            cRojo.setChecked(false);
            cAmarillo.setChecked(false);
        }
    };

    View.OnClickListener checkedRojo = new View.OnClickListener() {
        public void onClick(View v) {
            cAmarillo.setChecked(false);
            defaultCheckAzul(cRojo);
        }
    };

    View.OnClickListener checkedAmarillo = new View.OnClickListener() {
        public void onClick(View v) {
            cRojo.setChecked(false);
            defaultCheckAzul(cAmarillo);

        }
    };

    View.OnClickListener pintarTexto = new View.OnClickListener() {
        public void onClick(View v) {

            if(tContenido.getText().length() > 0){
                Intent intent = new Intent(MainActivity.this, ShowTextActivity.class);
                intent.putExtra("texto", tContenido.getText().toString());
                intent.putExtra("color", getColor().toString());
                startActivity(intent);
            }
            else{
                ShowAlert("Error", "Campo de texto vacío.");
            }
        }
    };

    private void defaultCheckAzul(CheckBox checkBox){
        if(!checkBox.isChecked())
            cAzul.setChecked(true);
        else
            cAzul.setChecked(false);
    }

    private ColorList getColor(){
        ColorList retorno;

        if(cAzul.isChecked())
            retorno = ColorList.Azul;
        else if (cRojo.isChecked())
            retorno = ColorList.Rojo;
        else
            retorno = ColorList.Amarillo;

        return retorno;
    }

    private void ShowAlert(String titulo, String texto){

        AlertDialog.Builder cuerpoAlerta = new AlertDialog.Builder(this);
        cuerpoAlerta.setTitle(titulo);
        cuerpoAlerta.setMessage(texto);
        cuerpoAlerta.setPositiveButton("Ok", null);

        cuerpoAlerta.create().show();


    }
}
