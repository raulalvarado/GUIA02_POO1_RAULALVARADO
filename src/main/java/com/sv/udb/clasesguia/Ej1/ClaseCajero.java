/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clasesguia.Ej1;

import com.sv.udb.clasesguia.Ej1.Dinero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ClaseCajero 
{
    List<Dinero> listMone;

    public ClaseCajero() 
    {
        this.listMone = new ArrayList<>();
    }
    
    public void agregar(int cant, double deno)
    {
        this.listMone.add(new Dinero(cant, deno));
    }
    
    public double calcular()
    {
         double resp = 0;
        try
        {
            for(Dinero temp : this.listMone)
            {
                resp += (temp.getCant() * temp.getDeno());
            }
                
        }
        catch(Exception ex)
        {
            System.err.println("Ha ocurrido un error: " + ex.getMessage());
        }
        return resp;
    }
    
    
}
