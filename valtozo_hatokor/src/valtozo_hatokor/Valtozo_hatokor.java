/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package valtozo_hatokor;




public class Valtozo_hatokor {
// globális változó IDE 

    static int globalisValtozo = 10;

    
    public static void main(String[] args) {
        // lokális változó a main metódusban

        int mainValtozo = 5;
        System.out.println("A mainValtozo értéke a main metódusban: " + mainValtozo);
        System.out.println("A globalisValtozo értéke a main metódusban: " + globalisValtozo);

        metodus1();
    } // MAIN VÉGE

    public static void metodus1() {
    //lokális változó metodus1-ben
    int metodus1Valtozo = 20;
    System.out.println("A metodus1Valtozo értéke a metodus1 metódusban: " + metodus1Valtozo);
    metodus2();
  

}
    public static void metodus2() {
    //lokális változó metodus1-ben
    int metodus2Valtozo = 1;
    System.out.println("A metodus2Valtozo értéke a metodus2 metódusban: " + metodus2Valtozo);
}



}// progi vége
