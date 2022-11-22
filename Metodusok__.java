/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok__;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Metodusok__ {

    /**
     * 
     */
    // 1. a legkisebb szám a három bekértből
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
    
    // 2. egy bekért szó középső betűje/ középső betűi
    public static String middle(String str)
    {
        int poz;
        int length;
        if (str.length() % 2 == 0)
        {
            poz = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            poz = str.length() / 2;
            length = 1;
        }
        return str.substring(poz, poz + length);
    }
    
    // 3. magánhangzók (angol) kiíratása
    public static int count_Vowels(String str)
    {
        int ossz = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {
                ossz++;
            }
        }
        return ossz;
    }
    
    // 4. szavak megszámolása bekért mondatból
    private static int countWordsInSentence(String input) {
    int wordCount = 0;

    if (input.trim().equals("")) {
        return wordCount;
    }
    else {
        wordCount = 1;
    }

    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        String str = new String("" + ch);
        if (i+1 != input.length() && str.equals(" ") && !(""+ input.charAt(i+1)).equals(" ")) {
            wordCount++;
        }
    }
    return wordCount;
 }
     // 5. érvényes jelsztó-e
    //6. a 3 kapott paraméterből eldönti, hogy növekvő sorrendben vannak-e
    public static  boolean sor(double a, double b, double c) {
        
    
    if(a < b && b < c){
        return true;
    }
    else {
        return false;
    }
}
    //7. Visszaadja egy int szám számjegyeinek összegét
    
    
    
    
    public static void main(String[] args) {
        
        //1.
        Scanner in = new Scanner(System.in);
        System.out.print("Add meg az első számot: ");
        double x = in.nextDouble();
        System.out.print("Add meg a második számot: ");
        double y = in.nextDouble();
        System.out.print("Add meg a harmadik számot: ");
        double z = in.nextDouble();
        System.out.print("A legkisebb szám " + smallest(x, y, z)+"\n" );
        
        //2.
        Scanner szo = new Scanner(System.in);
        System.out.print("Adj meg egy szót: ");
        String str1 = szo.nextLine();
        System.out.print("A középső karaktere a szavadnak: " + middle(str1)+"\n");
        
        //3.
        Scanner mgh = new Scanner(System.in);
        System.out.print("Adj meg egy szót: ");
        String str2 = mgh.nextLine();
        System.out.print("Angol magánhangzók száma: " + count_Vowels(str2)+"\n");
        
        //4.
        Scanner hany = new Scanner (System.in);
        System.out.println("Adj meg egy mondatot: ");
        String str3 = hany.nextLine();
        System.out.println("A mondatodban ennyi szó található: " + countWordsInSentence(str3)+"\n");
        
        //5.
        
        //6.
        Scanner rend = new Scanner(System.in);
        System.out.print("Add meg az első számot: ");
        double a = rend.nextDouble();
        System.out.print("Add meg a második számot: ");
        double b = rend.nextDouble();
        System.out.print("Add meg a harmadik számot: ");
        double c = rend.nextDouble();
        System.out.print("Van-e sorrend: " + sor(a, b, c) +"\n" );
    }
    
}
