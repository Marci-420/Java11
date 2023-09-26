/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix_resurrections;

import java.util.Scanner;

public class Matrix_resurrections {

     
    public static void martix (){

        int m, n, i, j;
        Scanner in = null;
        
            in = new Scanner(System.in);
            System.out.println("Add meg a mátrix oszlopainak számát: ");
            m = in.nextInt();
            System.out.println("Add meg a mátrix sorainak számát: ");
            n = in.nextInt();
  
            // mátrix deklarálása
            int first[][] = new int[m][n];
  
            // számok bekérése
            System.out.println("Adj meg számokat a mártix feltöltéséhez: ");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();
  
            // kiíratás
            System.out.println("A mátrix maga: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }
        
        
    }

  
    
    public static void main(String[] args)
    {
        martix();
    }
}
