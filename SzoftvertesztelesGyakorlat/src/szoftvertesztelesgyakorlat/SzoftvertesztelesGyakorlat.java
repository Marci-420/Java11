/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package szoftvertesztelesgyakorlat;


public class SzoftvertesztelesGyakorlat {

    

    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2.5, 4.8); //konstruktort hívja
        System.out.println(r); 

        System.out.println("Kerülete: " + r.getKerulet()); 
        System.out.println("Területe: " + r.getTerulet()); 

        //alapból nulla az értéke az oldalaknak
        Rectangle r2 = new Rectangle();
        System.out.println(r2); 

        // setterrel megváltoztatjuk az értékét
        r2.setA(10);
        r2.setB(20);
        System.out.println("Kerülete: " + r2.getKerulet()); 
        System.out.println("Területe: " + r2.getTerulet()); 

        // getterek 
        System.out.println("Az A oldal: " + r2.getA()); 
        System.out.println("A B oldal: " + r2.getB()); 


        //Téglalap-e, vagy négyzet?
        if (r2.isSquare()){
            System.out.println("Négyzet");
        }
        else{
            System.out.println("Téglalap");
        }

        System.out.println((r2.isSquare())? "Négyzet":"Téglalap");
    }

}
