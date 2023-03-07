/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.pkg31;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Main {
    
    public static void bruh (){
        System.out.println("--------------------------");
    }
    // 4x5 mátrix random számokkal
    public static void randomsz(int[][]szamok) {
        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
      
        Random r=new Random();
        
        for(i=0; i<sorok;i++) {
            for( j=0; j<4;j++) {
            szamok[i][j]=r.nextInt(10);
            System.out.print(szamok[i][j]+"\t");
        }
        System.out.println();
            
        }
    }
    
    // a mátrix elemeinek kiíratása visszafelé
    public static void reverse (int [][] szamok) {
        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
        for (i = sorok-1; i >= 0; i--) {
            for (j = oszlopok-1; j >= 0; j--){
                System.out.print(szamok[i][j]+"\t");
            }
            System.out.println();
        }
    }
     //a mátrix elemeinek összege
    public static int osszeg (int [][] szamok) {
        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
        int ossz = 0;
        for ( i = 0; i < sorok; i++) {
            for ( j = 0; j < oszlopok; j++) {
		ossz = ossz + szamok[i][j];
            }
		}
        return ossz;
    }
     //eldönti, hogy a a számok több, mint fele páros-e
    public static boolean paross(int[][] szamok){
       
        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
        
        float paros = 0;
        float mind = 0;
        for(i=0; i < sorok; i++) {
            for(j =0; j <oszlopok ; j++) {
                paros ++;
                 if (szamok[i][j] % 2 ==0) {
                    paros++;
            }
            }
        }
        return paros/mind > 0.5;
    }
    
    public static void dupla(int [][]szamok) {
        
        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
        
          for ( i = 0; i < sorok; i++) {
            for ( j = 0; j < oszlopok; j++) {
                szamok[i][j] = szamok[i][j] *2;
            }
          }
          
    }
    

    public static void main(String[] args) {
        
        int[][] szamok = new int [4][5];

        int i, j;
        int sorok = szamok.length;
        int oszlopok = szamok[0].length;
        
        randomsz(szamok);
        
        bruh();
        
        System.out.println("visszafele:");
        reverse(szamok);
        
        bruh();
        
        System.out.println("A számok összege: " + (osszeg(szamok)));

        bruh();
        
        System.out.println("páros-e a fele:" + (paross(szamok)));
        
        bruh();
        
        System.out.println("A mátrix duplázva: " );
        dupla(szamok);
        
        for(i=0; i < sorok; i++) {
            for(j =0; j <oszlopok ; j++) {
                System.out.print(szamok[i][j] + "\t ");
            }
            System.out.println();
    }
    }
    
}
