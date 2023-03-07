/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.pkg28.matrix;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Matrix {
    
    public static void bruh (){
        System.out.println("--------------------------");
    }

    // 5x5 mátrix random számokkal, 65 és 69 között
    public static void randomsz(int [][]szamok) {
        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
      
        Random r=new Random();
        
        for(i=0; i<sorok;i++) {
            for( j=0; j<5;j++) {
            szamok[i][j]= r.nextInt(4) + 65;
            System.out.print(szamok[i][j]+"\t");
        }
        System.out.println();
            
        }
    }
    
    // soronkénti maximum
    public static void sor_max(int[][]szamok) {
        
    int i, j;
    int sorok = szamok.length;
    int oszlopok = szamok[0].length;
        
    for(i=0; i < sorok; i++) {
            int max = 0;
            for(j =0; j <oszlopok ; j++) {
                if (szamok[i][j] > max) {
                    max = szamok[i][j];
                }
            }
             System.out.println("A(z)" + (i+1) + ". sor legnagyobb száma: " + max);
         }
    }

    // oszloponkénti minimum
    public static void oszlop_min(int[][]szamok) {
        
    int i, j;
    int sorok = szamok.length;
    int oszlopok = szamok[0].length;
        
    for(j =0; j < oszlopok ; j++) {
            int min = 69;
            for(i=0; i < sorok; i++) {
                if (szamok[i][j] < min) {
                    min = szamok[i][j];
                }
            }
             System.out.println("A(z) " + (j+1) + ". oszlop legkisebb száma: " + min);
         }
    }
    
    //2. mátrix létrehozása
    
     public static void randomsz2(int [][]szamok2) {
        int i, j;
        int sorok = szamok2.length;
        int oszlopok = szamok2[0].length;
      
        Random r=new Random();
        
        for(i=0; i<sorok;i++) {
            for( j=0; j<5;j++) {
            szamok2[i][j]= r.nextInt(4) + 65;
            System.out.print(szamok2[i][j]+"\t");
        }
        System.out.println();
            
        }
    }
    
     //a két mátrix összege
     public static void osszead(int[][] szamok, int[][] szamok2) {
        
        for (int i = 0; i < szamok.length; i++) {
            for (int j = 0; j < szamok[0].length; j++) {
                szamok2[i][j] = szamok[i][j] + szamok2[i][j];
                System.out.print(szamok2[i][j] + "\t");
        }
            System.out.println();
        }
     }
     
    //van-e két egyforma szám egymás mellett
    public static boolean egyforma_e(int [][] szamok){
    int i = 0;
    int j = 0;
    boolean igaze = false;
    while( !igaze || i < szamok.length){
        while(!igaze || j < szamok.length - 1){
            if (szamok[i][j] == szamok[i][j * 1]){
                igaze = true;
                System.out.println("Akad");
            }
            else{
                System.out.println("NINCS, NEM VOLT, ELFOGYOTT!");
                }
            j++;
        }
         i++;   
        }
    return igaze;
    }
    
    // statisztika, hogy hány darab van az adott tartomány (65-69) számaiból*
    public static int[] stats(int [][] szamok){
        int [] stat = new int[256];
        for(int i =0; i < szamok.length; i++){
             for (int j = 0; j < szamok[i].length; j++) {
                 int item = szamok[i][j];
                 stat[item]++;
             }
        }
        return stat;
    }

    
    //main things
    public static void main(String[] args) {
        int[][] szamok = new int [5][5];
       
        
        randomsz(szamok);
        
        bruh();
       
        sor_max(szamok);
        
        bruh();
        
        oszlop_min(szamok);
        
        bruh();
        
        int[][] szamok2 = new int[5][5];
        randomsz2(szamok2);
        
        bruh();
        
        osszead(szamok, szamok2);
        
        bruh();
        
        egyforma_e(szamok);
       
        bruh();
       
        int[] statEredmenyek = stats(szamok);
        for (int i=65; i<70; i++){
            System.out.println(i+1 +":" + statEredmenyek + " db");
        }
    }
}