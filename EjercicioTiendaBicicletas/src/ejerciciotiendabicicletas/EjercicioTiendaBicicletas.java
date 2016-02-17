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
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

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
                    // Nuevo cliente
                    break;
                case 2:
                    // Nueva reparación (asociada a un cliente)
                    break;
                case 3:
                    // Listado de misReparaciones()
                    break;
                case 4:
                    // Todas las reparaciones
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
