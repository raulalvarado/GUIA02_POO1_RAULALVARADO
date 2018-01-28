/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clasesguia.Ej4;

/**
 *
 * @author Raul
 */
public class Calculo {

    public Calculo() {
        
    }

    public boolean existePunto(String cadena)
    {
        boolean resultado=false;
        
        for(int i=0; i< cadena.length();i++)
        {
            if(cadena.substring(i,i+1).equals("."))
            {
                resultado=true;
                break;
            }
        }
        return resultado; 
    }
    
    public String operacion(String n1, String n2, String signo)
    {
        Double resultado=0.0;
        String respuesta;
        
        if(signo.equals("+"))
        {
            resultado=Double.parseDouble(n1)+Double.parseDouble(n2);
        }
        if(signo.equals("-"))
        {
            resultado=Double.parseDouble(n1)-Double.parseDouble(n2);
        }
        if(signo.equals("*"))
        {
            resultado=Double.parseDouble(n1)*Double.parseDouble(n2);
        }
        if(signo.equals("/"))
        {
            resultado=Double.parseDouble(n1)/Double.parseDouble(n2);
        }
        
        respuesta=resultado.toString();
        return respuesta;
    }
}
