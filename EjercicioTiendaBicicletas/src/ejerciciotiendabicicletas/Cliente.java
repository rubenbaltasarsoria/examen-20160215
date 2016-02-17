/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendabicicletas;

/**
 *
 * @author widemos
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String email;
    int numReparaciones = 0;

    private Reparacion[] reparaciones = new Reparacion[EjercicioTiendaBicicletas.MAX_REPARACIONES];

    public void addReparaciones(Reparacion r) {
        if (numReparaciones < EjercicioTiendaBicicletas.MAX_REPARACIONES) {
            reparaciones[numReparaciones] = r;
            numReparaciones++;
        }else{
            System.out.println("Excedido el limite de reparaciones");
        }

    }

    public void misReparaciones() {
        for (int i = 0; i < numReparaciones; i++) {
            System.out.println(reparaciones[i].getDescripcion());
            System.out.println(reparaciones[i].getFechaInicio());
            System.out.println(reparaciones[i].getFechaFin());
            System.out.println(reparaciones[i].getPagado());
            System.out.println(reparaciones[i].getCoste());
        }

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
