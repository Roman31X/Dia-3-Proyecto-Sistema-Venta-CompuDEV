package com.roman31X.vista;

import java.util.Scanner;

public class MensajesMenu {
    public static int opcionesMenu(Scanner consola){
        System.out.print("""
                         |--------------------------|
                         | SISTEMA ORDENES COMPUDEV |
                         |--------------------------|
                         | [1] - REGISTRAR ORDEN    |
                         | [2] - LISTAR ORDENES     |
                         | [3] - ACTUALIZAR ORDEN   |
                         | [4] - ELIMINAR ORDEN     |
                         | [5] - BUSCAR ORDEN X ID  |
                         | [6] - SALIR DEL SISTEMA  |
                         |--------------------------|"""+"\n");
        System.out.print("| Ingrese opción:  ");
        return Integer.parseInt(consola.nextLine());
    }

    public static void mensajeSalida(){
        System.out.println("""
                |---------------------------------------|
                | Gracias por usar la APP hasta pronto! |
                |---------------------------------------|""");
    }
}
