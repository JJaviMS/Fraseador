package com.example.android.fraseador;

/**
 * Created by Javi on 24/02/2017.
 */

public class FraseadorAndroid {
    private static String [] frases;

    public FraseadorAndroid (String [] lasFrases){
        frases = lasFrases;

    }
    private static int longitud ()
    {
        int resultado = 0;
        for (int i = 0; i<frases.length; i++)
            if (frases[i] != null) resultado = resultado + 1;
        return resultado;
    }
    String fraseAleatoria ()
    {
        return frases[(int)(longitud()*Math.random())];
    }

}
