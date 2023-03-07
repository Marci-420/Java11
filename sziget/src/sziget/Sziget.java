/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sziget;

/**
 *
 * @author user3
 */
public class Sziget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {0, 0, 200, 548, 20, 0, 0, 0, 310, 980, 1280, 650, 102, 0, 0, 45, 0, 21, 65, 0, 0};

        // 1. Legnagyobb sziget bal- és jobboldali partjainak meghatározása
        int maxIsland = Integer.MIN_VALUE;
        int maxLeft = -1, maxRight = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                int Left = i;
                while (i < lista.length && lista[i] != 0) {
                    i++;
                }
                int Right = i - 1;
                if (Right - Left > maxIsland) {
                    maxIsland = Right - Left;
                    maxLeft = Left;
                    maxRight = Right;
                }      
            }        
        }
        
         // 3. a sziget, ami a legközelebb van az óceán közepéhez
        int kozeli = Integer.MAX_VALUE;
        int kozeliIndex = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0) {
                int tav = Math.abs(lista[i] - 0);
                if (tav < kozeli) {
                    kozeli = tav;
                    kozeliIndex = i;
                }
            }             
        } 
            //hány sziget van? X
            int szigetsz= 0;
            for ( int i = 1; i < lista.length; i++ ) {
                if ( lista[i] !=0 && lista[i -1] ==0) {
                szigetsz = szigetsz + 1 ;
            }
        }
            
            //Melyik a legmagasabb pont? X
            int max = 0;
            for( int i = 1; i < lista.length; i++ ) {          
                if( lista[i] > lista[max] ) max = i;
            }
            //Hol van a legmeredekebb emelkedő?
            
            int csucs = Integer.MIN_VALUE;
            int start = 0;
            int end = 0;
        
            for (int i = 1; i < lista.length; i++) {
                int mag = lista[i] - lista[i - 1];
                if (mag > csucs) {
                    csucs = mag;
                    start = lista[i - 1];
                    end = lista[i];
                }
            }    
            //Van-e valamelyik szigeten 1 egységnyi völgy?
             
        boolean igaz = false;
        int eleje = 0;
        int kozepe = 0;
        int vege = 0;
       
        for(int i = 0; i < lista.length-2; i++){
             if(lista[i]>lista[i+1] && lista[i+1] < lista[i+2] && lista[i+1] != 0){
                 igaz = true;
                 eleje = lista[i];
                 kozepe = lista[i+1];
                 vege = lista[i+2];
             }
        }
            
            //Hol kezdődik az első sziget (hányadik egységnél)
                                               
            
            //Mekkora a legnagyobb sziget (hány egység hosszú)

                
        System.out.println("A legszélesebb sziget bal és jobb széle:" + maxLeft + " és " + maxRight + ".");
        System.out.println("Az óceánhoz legközelebbi sziget a " + lista[kozeliIndex] + ". a listában");
        System.out.println("Szigetek száma: " + szigetsz);
        System.out.println("A legmagasabb pont: " + lista[max] + ".");
        System.out.println("A legmeredekebb emelkedő: " + start + " és " + end + " között van.");
        System.out.println("Van e völgy?: " + igaz + " A völgy számai: " + eleje + ", " + kozepe + ", " + vege);
    }
    
}
   

        
                
    

