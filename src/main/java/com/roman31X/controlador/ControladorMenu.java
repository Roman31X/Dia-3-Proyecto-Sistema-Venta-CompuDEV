package com.roman31X.controlador;

import com.roman31X.servicios.EjecutarServicioCRUDB;
import com.roman31X.servicios.Orden;
import java.util.List;
import java.util.Scanner;
import static com.roman31X.vista.MensajesMenu.mensajeSalida;

public class ControladorMenu {

    public static EjecutarServicioCRUDB accion = new EjecutarServicioCRUDB();

    public static boolean ejecutarOperacion(int opcion, Scanner consola, List<Orden> ordenes) {
        switch (opcion){
            case 1 ->{
                accion.listarOrden(ordenes);
            }
            case 2 -> {
                accion.agregarOrden(consola,ordenes);
            }
            case 3 -> {
                accion.actualizarOrden(consola, ordenes);
            }
            case 4 -> {
                accion.eliminarOrden(consola, ordenes);
            }
            case 5 ->{
                accion.buscarOrden(consola, ordenes);
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
