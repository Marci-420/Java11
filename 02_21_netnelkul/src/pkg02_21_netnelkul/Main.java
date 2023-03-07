/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_21_netnelkul;

import java.util.Scanner;

public class Main {

    public static boolean prim_e (int szamok){
        int oszt = 0;
        for (int i =1; i<=szamok/2; i++){
            if ( szamok % i ==0 ){
                oszt++;
            }
        }
            return oszt == 1;
            
    }
           
    
    public static void main(String[] args) {
        Scanner szam = new Scanner(System.in);  
        int szamok = -1;
        
        
        while (szamok != 0){
            System.out.println("Adj meg egy számot: ");
            szamok = szam.nextInt();
       
        if (prim_e(szamok)){
            System.out.println("A(z) " + szamok + " prímszám.");
       }
        else{
            System.out.println("A(z) " + szamok + " nem prímszám.");
        }
    }
    }
}
    
    

