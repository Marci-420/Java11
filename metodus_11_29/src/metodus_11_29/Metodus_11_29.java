/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodus_11_29;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Metodus_11_29 {

    /**
     * @param args the command line arguments
     */
    
    //1. minden számjegye páros-e a bekért számnak
    public static boolean teszt(int n){
    final int e = 10;
    if (n == 0){
        return false;
    }
    while(n != 0){
        if((n % e) % 2 != 0){
            return false;
        }
        n /= 10;
    }
     return true;
   }
    
    //2. az egyik szám a másik kettő középpontja-eloép
    public static boolean kozepso(int a, int b, int c) {
        int maxNum = Math.max(a, Math.max(b, c));
        int minNum = Math.min(a, Math.min(b, c));
        int middleNum = a+b+c - maxNum - minNum;
        
        if (middleNum == a || middleNum == b || middleNum == c){
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public static void matrix (int matrix) {
        for (int m = 0; m < matrix; m++){
             for (int j = 0; j < matrix; j++){
            int neo = (int)(Math.random() *2) + 0;
            System.out.print(neo + "\t");
        }
        System.out.println("");
        }
    }
    public static void main(String[] args) {
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Adj meg egy számot:");
        int n = in.nextInt();
        System.out.print("Igaz-e, hogy a megadott szám minden számjegye páros: \n");
        System.out.println(teszt(n));
    
        Scanner kozep = new Scanner(System.in);
        System.out.print("Add meg az első számot: ");
        int a = in.nextInt();
        System.out.print("Add meg a második számot: ");
        int b = in.nextInt();
        System.out.print("Add meg a harmadik számot: ");
        int c = in.nextInt();
        System.out.println("Van-e középpont: " + kozepso(a, b, c));
        
        Scanner matrix = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int mat = in.nextInt();
        
        matrix(mat);
        
        
    
        }
    }
    

 }
    

