/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clasesguia.Ej1;

/**
 *
 * @author Estudiante
 */
public class Dinero {
    
    private int cant;
    private double deno;

    public Dinero() 
    {
        
    }
    
    public Dinero(int cant, double deno)
    {
        this.cant=cant;
        this.deno=deno;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getDeno() {
        return deno;
    }

    public void setDeno(double deno) {
        this.deno = deno;
    }
    
    
    
    
}
