package com.example.android.fraseador;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static  FraseadorAndroid frases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = new FraseadorAndroid(new String[]{
                "Hola",
                "Adios",
                "Frase random",
                "Prueba",
                "Android rules",
                "Frase",
                "¿Qué hay de cena?",
                 "Tengo hombre",
                "Hoy va a ser un buen dia",
                "ASDF",
                "1234",
                "String",
                "Prueba"});
    }
    public void displayText(String frase){
        TextView texto = (TextView) findViewById(R.id.texto);
        if (texto !=null)
        texto.setText(frase);
    }
    public void ponerTexto (View view){
        String frase = frases.fraseAleatoria();
        displayText(frase);
    }

}
