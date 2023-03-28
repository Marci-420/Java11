/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat_03_01;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Dolgozat_03_01 {
    
    public static void tagol (){
        System.out.println("--------------------------");
    }

    
    // 4x4 mátrix random számokkal, 10 és 30 között
    public static void feltoltes(int [][]matrix) {
        int i, j;
        int sorok = matrix.length;
        int oszlopok = matrix[0].length;
      
        Random r=new Random();
        
        for(i=0; i< sorok;i++) {
            for( j=0; j< matrix.length;j++) {
            matrix[i][j]= r.nextInt(20) + 10;
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.println();
            
        }
    }
    
    // soronként mennyi a különbség a legnagyobb és a legkisebb szám között
     public static void kulonbseg(int [][]matrix) {
        
    int i, j;
    int sorok = matrix.length;
    int oszlopok = matrix[0].length;
    
    for(i=0; i < sorok; i++) {
        int max = 0;
        int min = 30;
        int kulonbseg = 0;
            for(j =0; j <oszlopok ; j++) {
                  if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                    if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                    kulonbseg = max-min;
            }
            System.out.println("A(z)" + (i+1) + ". sorban a különbség:" + kulonbseg);
    }
     }
     
     //van-e prímszám
      public static boolean prim_e(int number){
          for (int i = 2; i < number; i++){
              if (number % i == 0) {
                  return false;
          }
      }
        return true;
            
        }
     
    // hol van az első prímszám?
    public static boolean containsPrime(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
             for(int j = 0; j < matrix.length; j++){
                 if(prim_e(matrix[i][j])){
                     return true;
                 }
             }
        }
        return false;
    }
    
    public static int[] firstPrime(int[][] matrix){
        int[] result = new int[2];
        for (int i = 0; i < matrix.length; i++){
             for(int j = 0; j < matrix.length; j++){
                   if(prim_e(matrix[i][j])){
                       result[0] = i;
                       result[1] = j;
                       return result;
                   }
             }
        }
        return null;
        
    }
    public static void main(String[] args) {
        int[][] matrix = new int [3][3];
       
        tagol();
        feltoltes(matrix);
        tagol();
        kulonbseg(matrix);
        tagol();
        if (containsPrime(matrix)){
            System.out.println("A mátrixban van prímszám.");
        }
        else{
            System.out.println("A mátrixban nincs prímszám.");
        }
        tagol();
        
        int[] place = firstPrime(matrix);
            System.out.println("Az első prímszám a(z) " + (place[0] +1) + ". sor " + (place [1]+1)+ ". eleme  .");
        
    }
    
}
