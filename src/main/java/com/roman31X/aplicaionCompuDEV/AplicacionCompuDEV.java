package com.roman31X.aplicaionCompuDEV;

import com.roman31X.modelo.Monitor;
import com.roman31X.modelo.Raton;
import com.roman31X.modelo.Teclado;

public class AplicacionCompuDEV {
    public static void main(String[] args) {

        Raton lenovo  = new Raton("USB","Lenovo");
        System.out.println(lenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth","Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",27);
        System.out.println(monitorLenovo);
    }
}
