/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * 
 * @author María C García Correas
 * @version 1.0
 * @since 05/03/2025
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Método constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Método constructor con todos los parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * Método que devuelve el saldo actual
     * @return saldo actual
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * 
     * Método ingresar
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * Método retirar
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
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
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Get the value of ERRORCANTIDADNEGATIVA
     *
     * @return the value of ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

}


    
   