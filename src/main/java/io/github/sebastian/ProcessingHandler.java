package io.github.sebastian;

import java.util.ArrayList;

public class ProcessingHandler {
    public static double getPromedio(ArrayList<Double> notas){
        double promedio = 0;
        for (int i = 0; i < notas.size(); i++) {
            promedio += notas.get(i);
        }
        return promedio;
    }
}
