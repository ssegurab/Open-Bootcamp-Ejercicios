package com.company;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();

        System.out.println(miCoche.puertas);
    }
}


class Coche {
    public int puertas = 5;

    public void IncrementarPuertas() {
        this.puertas++;
    }
}
