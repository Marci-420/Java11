/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alakzatok;

/**
 *
 * @author User1
 */
public class Alakzatok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle elso = new Circle ("Kör", 78.5, 5.0);
        System.out.println(elso);
        elso.setRadius(7.0);
        System.out.println(elso);
        
    }

}
