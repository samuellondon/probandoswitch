package org.example;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //DECLARANDO VARIABLES

        double tempertaturaAmbiente;

        System.out.print("ingrese temperatura ambiente");
        tempertaturaAmbiente = teclado.nextDouble();

       if (tempertaturaAmbiente==30.0){
       tempertaturaAmbiente=20.0;

       } else if (tempertaturaAmbiente==20.0) {
          tempertaturaAmbiente=25.0;

       } else if (tempertaturaAmbiente==40.0) {
           tempertaturaAmbiente=20.0;
       }


    }
}