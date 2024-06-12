package com.roman31X.servicios;

import com.roman31X.modelo.Computadora;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrden;

    public Orden() {
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }

    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }

    public int getIdOrden() {
        return idOrden;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public void mostrarOrden(){
        System.out.println("|------------------------------------[ORDEN #"+idOrden+"]----------------------------------------|");
        computadoras.forEach(System.out::println);
        System.out.println();
    }
}
