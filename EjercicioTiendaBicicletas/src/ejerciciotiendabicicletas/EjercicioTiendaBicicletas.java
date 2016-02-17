/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendabicicletas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioTiendaBicicletas {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static final int MAX_CLIENTES = 10;
    public static final int MAX_REPARACIONES = 100;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int opcion;
        Cliente[] clientes = new Cliente[MAX_CLIENTES];
        int numClientes = 0;
        
        
        do {
            
            System.out.println("BICI-REPAIR");
            System.out.println("-----------");
            System.out.println("  1. Nuevo cliente\n"
                    + "  2. Nueva reparación\n"
                    + "  3. Mis reparaciones\n"
                    + "  4. Todas las reparaciones\n"
                    + "  5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());
            
            switch (opcion) {
                case 1:
                    //Instanciamos cliente
                    if (numClientes < MAX_CLIENTES) {
                        Cliente c = new Cliente();

                        //Pedimos los datos
                        System.out.println("Introduzca nombre Cliente");
                        c.setNombre(br.readLine());
                        System.out.println("Introduzca apellidos Cliente");
                        c.setApellidos(br.readLine());
                        System.out.println("Introduzca DNI Cliente");
                        c.setDNI(br.readLine());
                        System.out.println("Introduzca email Cliente");
                        c.setEmail(br.readLine());

                        //Almacenamos en el array
                        clientes[numClientes] = c;

                        //Incrementamos el contador
                        numClientes++;
                    } else {
                        System.out.println("No puedes crear mas clientes");
                    }
                    
                    break;
                case 2:
                    // Nueva reparación (asociada a un cliente)
                    
                    //Mostrar un cliente
                    for (int i = 0; i < numClientes; i++) {
                        System.out.println(i+clientes[i].getNombre());
                    }
                    
                    System.out.println("Selecciona un cliente");
                    int n = Integer.parseInt(br.readLine());
                    
                    Reparacion r = new Reparacion();
                    
                    System.out.println("Introduzca descripcion");
                    r.setDescripcion(br.readLine());
                    System.out.println("Introduzca fechaInicio");
                    r.setFechaInicio(br.readLine());
                    System.out.println("Introduzca fechaFin");
                    r.setFechaFin(br.readLine());
                    System.out.println("Introduzca coste");
                    r.setCoste(Double.parseDouble(br.readLine()));
                    System.out.println("Pagado? s/n");
                    String respuesta = br.readLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        r.setPagado(true);
                    }
                    clientes[n].addReparaciones(r);
                    
                    
                    break;
                case 3:
                    // Listado de misReparaciones()
                     //Mostrar  clientes
                    for (int i = 0; i < numClientes; i++) {
                        System.out.println(i+clientes[i].getNombre());
                    }
                    
                    System.out.println("Selecciona un cliente");
                    int j = Integer.parseInt(br.readLine());
                    
                    System.out.println("reparaciones de "+clientes[j].getNombre());
                    clientes[j].misReparaciones();
                    
                    break;
                case 4:
                    // Todas las reparaciones
                    for (int i = 0; i < numClientes; i++) {
                        System.out.println("Nombre"+clientes[i].getNombre());
                        clientes[i].misReparaciones();
                    }
                    break;
                case 5:
                    System.out.println("INFO: Saliendo...");
                    break;
                default:
                    System.out.println("ERROR: Opción equivocada...");
            }
            
        } while (opcion != 5);
        
    }
    
}
