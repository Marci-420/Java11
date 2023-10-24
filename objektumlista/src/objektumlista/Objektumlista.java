

package objektumlista;
import java.util.*;

public class Objektumlista {

    
    public static void main(String[] args) {
        Eredmeny Viktor = new Eredmeny ("Viktor", "F", "XI", 1001);
        Eredmeny Dani = new Eredmeny ("Dániel", "KKP", "X", 100);
        Eredmeny harmadik = new Eredmeny ("Csaba", "literálisan bármelyik ellenzéki párt", "XVII", 1);
        Eredmeny negyedik = new Eredmeny ("WOW Párt feje", "WOW", "XII", 100);

        ArrayList<Eredmeny> eredmenyek = new ArrayList<>();
        eredmenyek.add(Viktor);
        eredmenyek.add(Dani);
        eredmenyek.add(harmadik);
        eredmenyek.add(negyedik);

        //Hány jelölt van?
        System.out.println("Jelöltek száma: " + eredmenyek.size());

        //Hányan szavaztak?
        int szavazat = 0;
        for (int i = 0; i < eredmenyek.size(); i ++){
            szavazat += eredmenyek.get(i).getSzavazat();
        }

        System.out.println("Szavazók száma: " + szavazat);

        //Hány jelöltre érkezett több mint 1000 szavazat?
        int ezres = 0;
        for (int i=0; i<eredmenyek.size(); i ++){
            if (eredmenyek.get(i).getSzavazat() > 1000){
               ezres += 1; 
            }
        }

        System.out.println("Ezer szavazatot túllépők száma: " + ezres);
        
        //Ki a WOW párt jelöltje

        String nev = " ";
        for (int i=0; i<eredmenyek.size(); i ++){
            if (eredmenyek.get(i).getPart() == "WOW"){
                nev = eredmenyek.get(i).getNev();
        }
    }
         System.out.println("A WOW párt jelöltje: " + nev);
         
         //Kik kaptak az átlag alatti szavazatot?
         ArrayList kisebb = new ArrayList<>();
         int osszSzavazat = 0;
         for (int i=0; i<eredmenyek.size(); i ++){
            osszSzavazat += eredmenyek.get(i).getSzavazat();
                if (eredmenyek.get(i).getSzavazat() < (osszSzavazat / eredmenyek.size())){
                    kisebb.add(eredmenyek.get(i).getNev());
}
        }   
         System.out.println("Akik nem érték el az átlag szavazatszámot: " + kisebb);

         
        //Kinek a neve végződik 'a' betűre?
        ArrayList a= new ArrayList<>();
        for (int i=0; i<eredmenyek.size(); i ++){
            if (eredmenyek.get(i).getNev().endsWith("a")){
                a.add(eredmenyek.get(i).getNev());
}
}
        System.out.println("A pártvezetők 'a'-ra végződő névvel: " + kisebb);
        
    }

}
