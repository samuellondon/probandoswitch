package org.example.ejemplo2;

public class Ejemplo2 {
    public static void main(String[] args) {

        int variableAlaQueLeMiroElEstado=100;
        switch (variableAlaQueLeMiroElEstado){
            case 0:
                System.out.println("el camino se fue por 0");
                break;
            case  10:
                System.out.println("el camino se fue por 10");
                break;
            case 100:
                System.out.println("el camino se fue por 100");
            default:
                System.out.println("el camino por defecto");
                System.out.println("no e ni 0, ni 10 ni 100");
                break;
        }
    }
}
