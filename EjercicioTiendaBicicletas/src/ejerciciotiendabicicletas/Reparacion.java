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
public class Reparacion {

        private String descripcion;
        private String fechaInicio;
        private String fechaFin;
        private double coste;
        private boolean pagado;

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the coste
     */
    public double getCoste() {
        return coste;
    }

    /**
     * @param coste the coste to set
     */
    public void setCoste(double coste) {
        this.coste = coste;
    }

    /**
     * @return the pagado
     */
    public boolean getPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
        
}
