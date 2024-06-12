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
                var pedido = accion.agregarOrden(consola,pedidos);
                System.out.println((pedido)?"|****R E G I S T R O--E X I T O S O****|":"|****R E G I S T R O--F A L L I D O****|");
            }
            case 3 -> {
                accion.actualizarOrden(consola, pedidos);
            }
            case 4 -> {
                accion.eliminarOrden(consola, pedidos);
            }
            case 5 ->{
                accion.buscarOrden(consola, pedidos);
            }
            case 6 -> {
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
