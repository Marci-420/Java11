/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendszam_input;

import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Rendszam_input {

    /**
     * @param args the command line arguments
     */
    
       do { 
        System.out.println("Adj meg egy rendszámot:");
        rendszam = bill.nextLine();
        } while (!isValidRendszamV2(rendszam));
    }
        public static void main(String[] args) {
    Scanner bill = new Scanner(System.in);
}
