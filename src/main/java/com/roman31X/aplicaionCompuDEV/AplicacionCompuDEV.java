package com.roman31X.aplicaionCompuDEV;

import com.roman31X.servicios.Orden;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.roman31X.controlador.ControladorMenu.ejecutarOperacion;
import static com.roman31X.vista.MensajesMenu.opcionesMenu;

public class AplicacionCompuDEV {

    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        List<Orden> pedidos = new ArrayList<>();

        while (!salir) {
            try {
                var opcion = opcionesMenu(consola);
                salir = ejecutarOperacion(opcion, consola, pedidos);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error al digitar una opción del menú: " + e.getMessage());
            }
        }

    }

}
