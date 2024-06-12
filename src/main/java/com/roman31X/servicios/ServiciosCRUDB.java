package com.roman31X.servicios;

import java.util.List;
import java.util.Scanner;

public interface ServiciosCRUDB {
    void listarOrden(List<Orden> pedidos);

    boolean agregarOrden(Scanner consola, List<Orden> pedidos);

    boolean eliminarOrden(Scanner consola, List<Orden> pedidos);

    boolean buscarOrden(Scanner consola, List<Orden> pedidos);

}
