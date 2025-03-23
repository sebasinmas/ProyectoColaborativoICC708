package io.github.sebastian;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class InputHandler {
    public static ArrayList<Double> getInput(){
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una por una las notas de su promedio, para salir escriba \"fin\" o \"salir\" ");
        while(true){
            System.out.print(">");
            String entrada =  sc.nextLine();
            if (entrada.equalsIgnoreCase("fin") || entrada.equalsIgnoreCase("salir")){
                break;
            }
            try{
                Double nota = Double.parseDouble(entrada);
                notas.add(nota);
            } catch (Exception e) {
                throw new RuntimeException("Input inválido");
            }
        }
        return notas;
    }
}
