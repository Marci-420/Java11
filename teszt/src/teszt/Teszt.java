/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teszt;

/**
 *
 * @author user3
 */
public class Teszt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] szamok = new int[] {5, 12, 7, 9, 24, 15};
        
        int i = 0;
        for (i = 0; i < szamok.length; i++){
            if (szamok[i] == 7){
                System.out.println(i);
            }
            
            
        }
    }
    
}
