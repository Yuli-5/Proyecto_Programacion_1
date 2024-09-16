/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Yuli
 */
public class Compra {
    private int idProveedor;
    private String nombreProveedor;
    private String celular;
    private int numCuenta;
   

    public Compra() {
    }

    public Compra(int idProveedor, String nombreProveedor, String celular, int numCuenta) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.celular = celular;
        this.numCuenta = numCuenta;
     
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    
    
}
