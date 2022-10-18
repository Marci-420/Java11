/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author user3
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // két operandusú
            int a = 43;
            int b = 35;
            int osszeg = a + b;
            System.out.println(osszeg);
            int kulonbseg = a - b;
            System.out.println(kulonbseg);
            int szorzat = a * b;
            System.out.println(szorzat);
            int hanyados = a / b;
            System.out.println(hanyados);
            int maradek = a % b;   //az a / b osztás MARDÉKÁT adja vissza 
            System.out.println(maradek);
            
            // egy operandusú
            
            int cé = 5;
            cé++; // cé értékének növelése 1-gyel postfix formában
            System.out.println(cé);  // cé értéke 6
            System.out.println(cé++);   // cé értéke 6 majd növeli eggyel -> 7
            
            System.out.println(++cé); //  cé értéke 8 lesz, ezt íratjuk ki
            // System.out.println("Ép tárcsázom a kurva anyádat");  // hát he
            // int Markybrain = 0;
            // System.out.println("Error" + MarkyBrain);
            int d = 3;
            d--; 
            System.out.println(--d);
            
            // relációs műveletek
            int x = 9;
            int y = 14;
            
            System.out.println(x > y);  //false
            System.out.println(y > x);  //true
            System.out.println(x == y);  //false
            System.out.println(x != y);  //true
            System.out.println(x >= y);  //false
            System.out.println(x <= y);  //true
            
            // logikai műveletek
            boolean t = true;
            boolean f = false;
            
            System.out.println(t && f );
            System.out.println(t || f);
            System.out.println(!t);
            
            //értékadó műveletek
            int k;
            k = 3;
            k = k + 1;
            k +=1; // összevontuk a műveleteket
            k -= 1;
            k *= 2;
            k /= 4;
            k %= 2;
            
            System.out.println(k);
            
            // összetett műveletek
            
            int z = 12;
            // 3-mal és 4-gyel IS osztható-e
            
            System.out.println((z % 3 == 0) && (z % 4 == 0));
            
            //3-mal vagy néggyel osztható-e
            System.out.println(z % 3 == 0 || z % 4 == 0);
            
            //3-mal vagy 5-tel nem osztható-e
            System.out.println(z % 3 != 0 || z % 5 != 0);
            
            // 5-tel osztható nem negatív szám-e
            System.out.println( z % 5 ==0 && z > 0);
            
            //
        
    }
    
}
