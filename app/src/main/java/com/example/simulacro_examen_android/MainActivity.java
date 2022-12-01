package com.example.simulacro_examen_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abreSegunda(View view) {
        Intent i = new Intent(this, SecondaryActivity.class);
        EditText et = findViewById(R.id.idNum);
        int num =Integer.parseInt(et.getText().toString());
        i.putExtra("numero", num);

        if(num >= 6 && num <= 10){
            Toast.makeText(this, "OK, USALO EN LA SIGUIENTE PANTALLA", Toast.LENGTH_SHORT).show();
            startActivity(i);
        } else {
            Toast.makeText(this, "VUELVE A INTRODUCIR EL NUMERO", Toast.LENGTH_SHORT).show();
        }

    }
}