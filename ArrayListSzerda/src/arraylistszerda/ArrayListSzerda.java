/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistszerda;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author user3
 */
public class ArrayListSzerda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();
        
    int i;
    Random rand = new Random();
        
    //lista feltöltése random számokkal
    for(i = 0; i <10; i++){
        int egyszam =rand.nextInt(10) +10;
            szamok.add(egyszam);
    }
    
    //ArrayList kiíratása
    for(i = 0; i < szamok.size(); i++){
        System.out.println(szamok.get(i) + " ");
    }
   
    int paros = 0;
    for(i = 0; i < szamok.size(); i++) {
        if ((szamok[i] % 2) ==0);
        paros ++;
    }
    
        System.out.println(paros + "darab páros szám van");
    }
    
}
