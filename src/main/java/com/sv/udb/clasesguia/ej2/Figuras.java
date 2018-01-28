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
    
    public void asteriscos() {
        System.out.println();
        for (int i4 = 0; i4 < 4; i4++) {

            for (int x = 0; x < 4; x++) {
                System.out.print("  ");
                System.out.print("* ");
                if (x == 3) {
                    System.out.println();
                }
            }

            for (int y = 0; y < y; y++) {
                System.out.print("* ");
                System.out.print("  ");
                if (y == 3) {
                    System.out.println();
                }

            }
        }
    }
    
        public void cubitos() {
        for (int i = 0; i < 4; i++) {

            for (int q = 0; q < 3; q++) {
                for (int n = 0; n < 4; n++) {
                    for (int x = 0; x < 3; x++) {
                        System.out.print("  ");
                    }
                    for (int y = 0; y < 3; y++) {
                        System.out.print("*");
                    }
                    if (n == 3) {
                        System.out.println();
                    }
                }

            }

            for (int i2 = 0; i2 < 3; i2++) {
                for (int n = 0; n < 4; n++) {
                    for (int x = 0; x < 3; x++) {
                        System.out.print("*");
                    }
                    for (int y = 0; y < 3; y++) {
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

        for (int i3 = 1; i3 <= 10; i3++) {
            System.out.println(" ");

            cont = (2 * i3) - 1;

            for (int s = 1; s <= (10 - i3); s++) {
                System.out.print(" ");
            }

            for (int u = i3; u <= cont; u++) {
                System.out.print(u % 10);
            }

            for (int m = (cont - 1); m >= i3; m--) {
                System.out.print(m % 10);
            }
        }
    }

}
