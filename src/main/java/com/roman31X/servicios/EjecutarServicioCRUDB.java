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
            //pedidos.forEach(System.out::println);
        }else{
            System.out.println("|----La lista aun esta vacía debe registrar  una orden Primero----|");
        }
    }

    @Override
    public boolean agregarOrden(Scanner consola, List<Orden> pedidos) {
        System.out.print("Ingrese cuantos computadores agregar a esta orden: ");
        var cantidadComputador =  Integer.parseInt(consola.nextLine());
        var orden = new Orden();

        if(cantidadComputador > 0){
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
    public boolean actualizarOrden(Scanner consola, List<Orden> ordenes) {

        return false;
    }

    @Override
    public boolean eliminarOrden(Scanner consola, List<Orden> ordenes) {
        return false;
    }

    @Override
    public boolean buscarOrden(Scanner consola, List<Orden> ordenes) {
        return false;
    }
}
