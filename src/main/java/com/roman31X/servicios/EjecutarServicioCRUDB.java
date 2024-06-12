package com.roman31X.servicios;

import com.roman31X.modelo.Computadora;
import com.roman31X.modelo.Monitor;
import com.roman31X.modelo.Raton;
import com.roman31X.modelo.Teclado;

import java.util.List;
import java.util.Scanner;

public class EjecutarServicioCRUDB implements ServiciosCRUDB{

    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private Computadora computadora;

    @Override
    public void listarOrden(List<Orden> pedidos) {
        if(!pedidos.isEmpty()){
            for (Orden orden : pedidos) {
                orden.mostrarOrden();
            }
        }else{
            System.out.println("|----La lista aun esta vacía debe registrar una orden Primero----|");
        }
    }

    @Override
    public boolean agregarOrden(Scanner consola, List<Orden> pedidos) {
        System.out.print("Ingrese cuantos computadores agregar a esta orden: ");
        var cantidadComputador =  Integer.parseInt(consola.nextLine());

        if(cantidadComputador > 0){
            var orden = new Orden();
            for (int i = 1; i <= cantidadComputador; i++) {
                System.out.print("|---------REGISTRO DEL COMPUTADOR #"+i+"---------|\n");
                System.out.print("| Ingrese nombre del computador: ");
                var nombreComputador = consola.nextLine();
                System.out.print("| Ingrese marca monitor: ");
                var marcaMonitor = consola.nextLine();
                System.out.print("| Ingrese tamaño de la pantalla: ");
                var tamanioPantalla = Integer.parseInt(consola.nextLine());
                System.out.print("| Tipo entrada Teclado: ");
                var tecladoTipo = consola.nextLine();
                System.out.print("| Marca del Teclado: ");
                var tecladoMarca = consola.nextLine();
                System.out.print("| Tipo entrada Ratón: ");
                var ratonTipo = consola.nextLine();
                System.out.print("| Marca del Ratón: ");
                var ratonMarca = consola.nextLine();

                monitor = new Monitor(marcaMonitor,tamanioPantalla);
                teclado = new Teclado(tecladoTipo,tecladoMarca);
                raton  = new Raton(ratonTipo,ratonMarca);

                computadora = new Computadora(nombreComputador,monitor,teclado,raton);
                orden.agregarComputadora(computadora);

                System.out.println("|*******************REGISTRO DE COMPUTADOR EXITOSO****************|");
            }

            pedidos.add(orden);
            return true;

        }
        System.out.println("DEBE DE INGRESAR UNA CANTIDAD VALIDA Y NO: "+cantidadComputador);
        return false;
    }

    @Override
    public boolean eliminarOrden(Scanner consola, List<Orden> pedidos) {
        if(!pedidos.isEmpty()){
            System.out.println("|--------ELIMINACIÓN POR ID DE ORDEN--------|");
            System.out.println("Ingrese ID a eliminar:");
            var id = Integer.parseInt(consola.nextLine());
            var logrado = false;
            for (Orden orden : pedidos) {
                if(orden.getIdOrden() == id){
                    System.out.println("| Se elimino a: ");
                    orden.mostrarOrden();
                    pedidos.remove(orden);
                    logrado = true;
                    break;
                }
            }
            return true;
        }

        System.out.println("|----La lista aun esta vacía debe registrar primero-----|");
        return false;
    }

    @Override
    public boolean buscarOrden(Scanner consola, List<Orden> pedidos) {
        if(!pedidos.isEmpty()){
            System.out.println("|--------BUSCAR ORDEN POR ID--------|");
            System.out.print("| Ingrese ID:");
            var id = Integer.parseInt(consola.nextLine());
            for (Orden orden : pedidos) {
                if(orden.getIdOrden() == id){
                    orden.mostrarOrden();
                    return true;
                }
            }
        }else{
            System.out.println("|----La lista aun esta vacía debe registrar primero-----|");
        }
        return false;
    }
}
