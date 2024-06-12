package com.roman31X.controlador;

import com.roman31X.servicios.EjecutarServicioCRUDB;
import com.roman31X.servicios.Orden;
import java.util.List;
import java.util.Scanner;
import static com.roman31X.vista.MensajesMenu.mensajeSalida;

public class ControladorMenu {

    public static EjecutarServicioCRUDB accion = new EjecutarServicioCRUDB();

    public static boolean ejecutarOperacion(int opcion, Scanner consola, List<Orden> pedidos) {
        switch (opcion){
            case 1 ->{
                accion.listarOrden(pedidos);
            }
            case 2 -> {
                var pedidoRegistro = accion.agregarOrden(consola,pedidos);
                System.out.println((pedidoRegistro)?"|****R E G I S T R O--E X I T O S O****|":"|****R E G I S T R O--F A L L I D O****|");
            }
            case 3 -> {
                var pedidoEliminar = accion.eliminarOrden(consola, pedidos);
                System.out.println((pedidoEliminar)?"|****E L I M I N A C I Ó N--E X I T O S O****|":"|****E L I M I N A C I Ó N--F A L L I D A****|");
            }
            case 4 ->{
                var pedidoBuscar = accion.buscarOrden(consola, pedidos);
                System.out.println((pedidoBuscar)?"|****B Ú S Q U E D A--E X I T O S O****|":"|****B Ú S Q U E D A--F A L L I D A****|");
            }
            case 5 -> {
                mensajeSalida();
                return true;
            }
            default -> {
                System.out.println("Opción ingresada fuera del menú: "+opcion);
            }
        }
        return false;
    }
}
