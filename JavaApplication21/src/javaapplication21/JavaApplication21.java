/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class JavaApplication21 {
   public static boolean isLeapYear(int szokoev) {
    if (szokoev % 4 != 0) {
        return false;
  } else if (szokoev % 400 == 0) {
        return true;
  } else if (szokoev % 100 == 0) {
        return false;
  } else {
        return true;
  }
 }
    public static void sorminta(){
        System.out.println("**************************");
        System.out.println("*    Feladat befejezve   *");
        System.out.println("**************************");
    }
   
    public static void main(String[] args) {
     
    Scanner bill = new Scanner(System.in);
    System.out.println("Adj meg egy évszámot: ");
    int szokoev = bill.nextInt();
    
    sorminta();

}
}
