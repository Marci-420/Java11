/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_02_07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Matrix_02_07 {
    
    public static void szun (){
        System.out.println("--------------------------");
    }
    
    public static int[][] Matrix(int sz, int h){
        int[][] matrix = new int[h][sz];
        Random random = new Random();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < sz; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }
    public static void kiiratas(int[][] matrix) {
        int h = matrix.length;
        int sz = matrix[0].length;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
           
           
           
        }
    }
    public static int foatlo(int[][] matrix) {
    int osszead = 0;
    for (int i = 0; i < matrix.length; i++) {
      osszead += matrix[i][i];
    }
    return osszead;
  }
    public static void csere(int[][] matrix, int sor,int oszlop, int csere) {
     matrix[sor][oszlop] = csere;
  }
    public static int[][] Matrix2(int s, int o) {
        int[][] matrix = new int[s][o];
        Random random = new Random();

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < o; j++) {
                matrix[i][j] = random.nextInt(11);
            }
        }
        return matrix;
    }
      public static boolean azonos_e(int[][] matrix1, int[][] matrix2) {
    if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
      return false;
    }
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1[0].length; j++) {
        if (matrix1[i][j] != matrix2[i][j]) {
          return false;
        }
      }
    }

    return true;
  }
      
    public static int[][] forditott(int[][] matrix) {
    int sor = matrix.length;
    int oszlop = matrix[0].length;
    int[][] reversematrix = new int[sor][oszlop];

    for (int i = 0; i < sor; i++) {
      for (int j = 0; j < oszlop; j++) {
        reversematrix[i][j] = matrix[sor - i - 1][oszlop - j - 1];
      }
    }

    return reversematrix;
  } 

    public static void main(String[] args) {
        int h = 5, sz = 5;
        int[][] matrix = Matrix(h, sz);
        kiiratas(matrix);
        
        szun();
        
        System.out.println("A mátrix fő átlójának összege: " + foatlo(matrix));
        
        szun();
        
        Scanner matr = new Scanner(System.in);  
        System.out.println("Add meg a cserélni kívánt elem sorának számát és az oszlopának számát: ");
        int sor = matr.nextInt();
        int oszlop = matr.nextInt();
        System.out.println("Add meg azt a számot, amiRE cserélni akarod a fentebbi értéket:: ");
        int csere = matr.nextInt();
        csere(matrix, sor,oszlop,csere);
        System.out.println("A felcserélt mátrix: ");
        kiiratas(matrix);
        
        szun();
        
        int[][] matrix2 = Matrix(h, sz);
        System.out.println("A második mátrix: ");
        kiiratas(matrix2);
        boolean ugyanaz = azonos_e(matrix, matrix2);
        if (ugyanaz) {
          System.out.println("A két mátrix megegyezik.");
        } else {
          System.out.println("A két mátrix nem egyezik meg.");
          
          szun();
          
        System.out.println("Az 1. matrix");
        kiiratas(matrix1);
        System.out.println("A fordított mátrix: ");
        int[][] reversematrix = forditott(matrix1);
        kiiratas(reversematrix);
         
        }
  }
    }