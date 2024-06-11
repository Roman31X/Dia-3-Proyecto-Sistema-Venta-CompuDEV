package com.roman31X.modelo;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    public static void setContadorTeclado(int contadorTeclado) {
        Teclado.contadorTeclado = contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado: [" +
                "ID Teclado: [" + idTeclado +
                "] "+super.toString();
    }
}
