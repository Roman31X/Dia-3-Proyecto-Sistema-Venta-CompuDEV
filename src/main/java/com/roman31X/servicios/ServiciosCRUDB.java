package com.roman31X.servicios;

import java.util.List;
import java.util.Scanner;

public interface ServiciosCRUDB {
    void listarOrden(List<Orden> ordenes);

    boolean agregarOrden(Scanner consola, List<Orden> ordenes);

    boolean actualizarOrden(Scanner consola, List<Orden> ordenes);

    boolean eliminarOrden(Scanner consola, List<Orden> ordenes);

    boolean buscarOrden(Scanner consola, List<Orden> ordenes);

}
