package com.roman31X.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    private Monitor() {
        idMonitor = ++contadorMonitor;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "ID Monitor: [" + idMonitor +
                "] Marca: [" + marca +
                "] Tamaño: [" + tamanio +
                ']';
    }
}
