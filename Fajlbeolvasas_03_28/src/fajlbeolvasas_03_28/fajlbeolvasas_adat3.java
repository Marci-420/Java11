/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas_03_28;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class fajlbeolvasas_adat3 {  
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String seged = null;
        int[][] matrix = new int[5][4];
        
        try
        {
            int db = 0;
            raf = new RandomAccessFile("adatok_drei.txt", "r");
            sor= raf.readLine();
            
            while(sor != null){
                seged = sor.split(" ");             
                for(int i = 0; i < 4; i++){
                    matrix[db][i]=Integer.parseInt(seged[i]);
                 }    
                 db++;
                 sor = raf.readLine()
            }  
              raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(matrix[i]);
        }
        }
    }

         
    

