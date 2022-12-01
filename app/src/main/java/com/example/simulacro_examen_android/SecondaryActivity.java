package com.example.simulacro_examen_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SecondaryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        reciboNumero();

    }



    private int reciboNumero() {

        int iNum = getIntent().getExtras().getInt("numero",-1);
        //Toast.makeText(this, String.valueOf(iNum), Toast.LENGTH_SHORT).show();
        return iNum;
    }


    public void pulsarNum(View view) {
        Button boton = (Button) view;
        String numeroString = boton.getText().toString(); //recuperamos el string del boton
        int numeroInt = Integer.parseInt(numeroString); //parseamos el string a int
    }

    public void jugar(View view) {
        int semilla = reciboNumero();
        Random rnd = new Random();
        int aleatorio = rnd.nextInt(semilla + 100000) * semilla;
        Toast.makeText(this, String.valueOf(aleatorio), Toast.LENGTH_LONG).show();

    }


}