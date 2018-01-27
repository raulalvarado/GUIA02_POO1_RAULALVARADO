/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clasesguia.ej2;

/**
 *
 * @author Raul
 */
public class Figuras {

    public void cubitos() {
        //imprimiendo los bloques las veces necesarias
        for (int b = 0; b < 4; b++) {

            //imprimiendo  el primer bloque
            for (int a = 0; a < 3; a++) {
                for (int n = 0; n < 4; n++) {
                    for (int i = 0; i < 3; i++) {
                        System.out.print("  ");
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("* ");
                    }
                    if (n == 3) {
                        System.out.println();
                    }
                }

            }

            //imprimiendo el segundo bloque
            for (int a = 0; a < 3; a++) {
                for (int n = 0; n < 4; n++) {
                    for (int i = 0; i < 3; i++) {
                        System.out.print("* ");
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("  ");
                    }
                    if (n == 3) {
                        System.out.println();
                    }
                }

            }
        }
    }

    public void piramide() {
        System.out.println();
        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");

            cont = (2 * i) - 1;

            for (int n = 1; n <= (10 - i); n++) {
                System.out.print(" ");
            }

            for (int m = i; m <= cont; m++) {
                System.out.print(m % 10);
            }

            for (int o = (cont - 1); o >= i; o--) {
                System.out.print(o % 10);
            }
        }
    }

    public void asteriscos() {
        //imprimiendo los bloques las veces necesarias
        System.out.println();
        for (int b = 0; b < 4; b++) {

            //imprimiendo  el primer bloque
            for (int n = 0; n < 4; n++) {
                System.out.print("  ");
                System.out.print("* ");
                if (n == 3) {
                    System.out.println();
                }
            }

            //imprimiendo el segundo bloque
            for (int n = 0; n < 4; n++) {
                System.out.print("* ");
                System.out.print("  ");
                if (n == 3) {
                    System.out.println();
                }

            }
        }
    }

}
