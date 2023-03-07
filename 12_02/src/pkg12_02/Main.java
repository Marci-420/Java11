/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_02;
import java.util.Arrays;
/**
 *
 * @author user3
 */
public class Main {

    // megkeresi egy tömb második legnagyobb elemét
    public static int masodiksz(int[] a, int total){  
    int adott;  
    for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    adott = a[i];  
                    a[i] = a[j];  
                    a[j] = adott;  
                }  
            }  
        }  
       return a[total-2];  
      }  
    
    public static void main(String args[]){  
    int a[]={11, 2, 34, 33, 56, 420}; 
    System.out.println("A lista második legnagyobb eleme: "+masodiksz(a,6));  
     } 
}
    

