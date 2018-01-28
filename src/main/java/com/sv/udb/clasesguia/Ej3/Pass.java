/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clasesguia.Ej3;

/**
 *
 * @author Raul
 */
public class Pass {

    public Pass() {
    }
    
    String Temp="";
    public String num(String g)
    {
        String Intento="";
        
        Intento=g+Temp;
        return Intento;
    }
    
    public boolean validar(String t)
    {
        String clave="80085";
        
        if(t.equals(clave))
        {
            return true;
        }
        
        else
        {
            return false;
        }
        
    }
    
}
