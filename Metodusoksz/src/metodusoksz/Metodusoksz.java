/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusoksz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Metodusoksz {
    
    //metódusok és osztályok helye
    /**
     *
     */
    //Metódusok és osztályok helye
    public static double atlag(int szam1, int szam2) {
        double atl = (szam1 + szam2) / 2.0;
        return atl;
    }

    public static int veletlen(int also, int felso) {
        Random rand = new Random();
        int randomSzam = rand.nextInt(felso - also + 1) + also;
        return randomSzam;
    }
     public static double terfogat(double ta, double mag) {
        Scanner bill = new Scanner(System.in);
        return (ta * mag) % 3;
    }
    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        

        //Két szám átlaga
        System.out.println(atlag(4, 5));

        //Random szám generálása bekért tartományból
        System.out.print("Adj meg egy egész számot: ");
        int a = bill.nextInt();
        System.out.print("Adj meg még egy egész számot: ");
        int b = bill.nextInt();
        
        if (a < b){
            System.out.println(veletlen(a,b));
        } 
        else if (b < a) {
            System.out.println(veletlen(b,a));
        } else System.out.println("A két számból nem generálható véletlen szám.");
        
        int tombsz[] = new int [20];
        for (int i=0; i<20; i++) {
            tombsz[i] = veletlen(a, b);
            System.out.print(tombsz[i] + "; " );
        }
   
        
    
        // gúla térfogat bekérés
        System.out.print("Add meg a gúla oldalát: ");
        double ta = bill.nextDouble();
        System.out.print("Add meg a gúla magasságát: ");
        double mag = bill.nextDouble();
        
        System.out.println("A gúla térfogata: " + terfogat(ta, mag) );
       
        
        }   
     }
   

