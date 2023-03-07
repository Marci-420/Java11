/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_09;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Main {


    public static szamitasok (double p, double r, double t, double n){
        this.p = p;
        
        
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        float p, r, t, n;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n=sc.nextFloat();      //Initialize the variables
        sc.close();
        
        //Calculate the compound interest
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}
    
    

