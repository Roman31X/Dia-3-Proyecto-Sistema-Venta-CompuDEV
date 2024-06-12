package com.roman31X.aplicaionCompuDEV;

import com.roman31X.modelo.Computadora;
import com.roman31X.modelo.Monitor;
import com.roman31X.modelo.Raton;
import com.roman31X.modelo.Teclado;

public class AplicacionCompuDEV {
    public static void main(String[] args) {

        Raton ratonLenovo  = new Raton("USB","Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth","Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",27);
        System.out.println(monitorLenovo);

        System.out.println();
        Computadora computadoraLenovo = new Computadora("Computador Lenovo",
                monitorLenovo,
                tecladoLenovo,
                ratonLenovo);

        System.out.println(computadoraLenovo);
    }
}
