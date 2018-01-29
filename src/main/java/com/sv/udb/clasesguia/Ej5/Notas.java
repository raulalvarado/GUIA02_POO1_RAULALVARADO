/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clasesguia.Ej5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class Notas {

    public Notas() {
    }
    
     public void crear(String titulo, String cuerpo) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("*GUIA02_POO1_RAULALVARADO\\src\\main\\resources\\"+ titulo+".txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write(cuerpo);
            bfwriter.close();
            JOptionPane.showMessageDialog(null, "El archivo ha sido creado.");

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                if (flwriter != null) {
                        try {
                                flwriter.close();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
        }
    }
     
      public void eliminar(String archivo){
        File file = new File("*GUIA02_POO1_RAULALVARADO\\src\\main\\resources\\"+ archivo);
        try{
            file.delete();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
      
    
}
