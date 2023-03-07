/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d_tomb;

import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2D tömb (mátrix) "inicializálása"
        int[][] szamok = {{2,9,7}, {1,0,3}};
        int i, j; // i a sor, j az oszlop amúgy
        int sorokszama = szamok.length;
        int oszlopokszama = szamok[0].length;
        
        //2D tömb bejárása
        System.out.println(sorokszama); //mátrix mérete (sorok száma)
        i = 0;
        System.out.println(oszlopokszama ); //sor mérete (oszlopok száma)
        
        for(i=0; i < sorokszama; i++) {
            for(j =0; j <oszlopokszama ; j++) {
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println(); //sortörés...
        }
        //----------------------------------------------------------------------
        // 2. sor bejárása
        for (j = 0; j < szamok[1].length; j++) {
            System.out.println(szamok[1][j]);
        } 
        System.out.println();
        //2. oszlop bejárása
        for (i = 0; i < sorokszama; i++) {
            System.out.println(szamok[i][1]);
        }
        System.out.println();
        
        // tömb elemeinek összege
        int osszeg = 0;
        for(i=0; i < sorokszama; i++) {
            for(j =0; j <oszlopokszama ; j++) {
                osszeg = osszeg + szamok[i][j];
        }
        }
        System.out.println(osszeg);
        
        //tömb sorainak összege
        
        for(i=0; i < sorokszama; i++) {
            int sorosszeg = 0;
            for(j =0; j <oszlopokszama ; j++) {
                sorosszeg = sorosszeg + szamok[i][j];
            }     
            System.out.println(sorosszeg);
        }
        
        //páros
        int paros = 0;
         for(i=0; i < sorokszama; i++) {
            for(j =0; j <oszlopokszama ; j++) {
                if (szamok[i][j] % 2 ==0) {
                    paros = paros + 1;
                }
            }
         }
         System.out.println(paros);
         //páros soronként
        
         for(i=0; i < sorokszama; i++) {
             int sorparos = 0;
            for(j =0; j <oszlopokszama ; j++) {
                if (szamok[i][j] % 2 ==0) {
                    sorparos = sorparos + 1;
                }
            }
             System.out.println(sorparos);
         }
         
         //járjuk be a mátrixot oszloponként
         for(j=0; j < szamok[0].length; j++) {
            for(i =0; i <sorokszama; i++) {
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println(); //sortörés megint...
         }
         //összeg oszloponként
        for(j=0; j < szamok[0].length; j++) {
            int sorosszeg = 0;
            for(i =0; i <sorokszama; i++) {
                sorosszeg = sorosszeg + szamok[i][j];
            }     
            System.out.println(sorosszeg);
        }
            
        Random r=new Random();
        int[][] a=  new int[3][5];
        for(i=0; i<sorokszama;i++) {
            for( j=0; j<4;j++) {
            a[i][j]=r.nextInt(5);
            System.out.print(a[i][j]+"\t");
        }
        System.out.println();
      
        }
        
        
        
    }
}
