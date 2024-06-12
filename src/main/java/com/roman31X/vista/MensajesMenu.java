package com.roman31X.vista;

import java.util.Scanner;

public class MensajesMenu {
    public static int opcionesMenu(Scanner consola){
        System.out.print("""
                         |--------------------------|
                         | SISTEMA ORDENES COMPUDEV |
                         |--------------------------|
                         | [1] - LISTAR ORDEN       |
                         | [2] - REGISTRAR ORDENES  |
                         | [3] - ELIMINAR ORDEN     |
                         | [4] - BUSCAR ORDEN X ID  |
                         | [5] - SALIR DEL SISTEMA  |
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
