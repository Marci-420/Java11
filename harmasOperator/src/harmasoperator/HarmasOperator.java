/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmasoperator;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class HarmasOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        String decide;
        if (num < 20) {
            decide= "kisebb";
        }
        else {
            decide = "nagyobb";
        }
        System.out.println(decide);
        
        decide =(num < 20)? "kisebb":"nagyobb";
        System.out.println(decide);
        
        //A(z) karakter nagybetűs
        Scanner bill = new Scanner(System.in);
        System.out.println("Adj meg egy betűt: ");
        char kar = bill.next().charAt(0);
        
        if(Character.isUpperCase(kar)){
            System.out.println("A(z) "+ kar +" karakter nagybetűs");
        }
        else{
            System.out.println("A(z) " + kar + " karakter kisbetűs");
        }        
        System.out.println((Character.isUpperCase(kar))?  "A(z )" + kar + " karakter nagybetűs" : "A(z) "+ kar +  "karakter kisbetűs");
        
       //bekérjük egy hónap sorszámát, és megmondjuk, hogy hány napos az adott hónap
       Scanner SN = new Scanner(System.in);

    int ev = 2020;
    int honap = 0;
    int napok;

    System.out.println("Add meg egy hónap sorszámát (1-12): ");
    honap = SN.nextInt();

    switch (honap) {
        
    case 4:
    case 6:
    case 9:
    case 11:
      napok = 30;
      break;

    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      napok = 31;
      break;

    case 2:
      if (ev % 4 == 0 && ev % 100 != 0 || ev % 400== 0) {
        napok = 29;
        break;
      }
     
      else{
        napok = 28;
        break;
      }
      

    default:
      napok= 0;
      break;
    }

    if (napok != 0){
    System.out.println("A(z) " + honap + ". hónap "+ napok + " napból áll.");
    }
    else{
      System.out.println("A megadott számhoz nem tartozik hónap");
    }
    }
}
