/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista;

/**
 *
 * @author Gabriel
 */
public class Empleados {
    
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     private int edad;

    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    private String cedula;

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    private double sueldo;

    /**
     * Get the value of sueldo
     *
     * @return the value of sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Set the value of sueldo
     *
     * @param sueldo new value of sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    private String ciudad;

    /**
     * Get the value of ciudad
     *
     * @return the value of ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Set the value of ciudad
     *
     * @param ciudad new value of ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
        private String departamento;

    /**
     * Get the value of departamento
     *
     * @return the value of departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Set the value of departamento
     *
     * @param departamento new value of departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public Empleados(String nombre, int edad, String cedula, double sueldo, String ciudad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

}
