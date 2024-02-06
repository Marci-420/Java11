import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TortaTest {


    private static Torta t1, t2, t3, t4, t5;

    @BeforeAll
    static void beforeAll() {
        t1 = new Torta();
        t2 = new Torta(5, true, "csillag");
        t3= new Torta();
        t4 = new Torta(2, true, "csillag");
    }

    @Test
    void ujEmeletTeszt() {
        t2.ujEmelet();
        Assertions.assertEquals(6, t2.getEmeletSzam(), "Hibás az ujEmelet() metódus!");
}

    @Test
    void setAlakMetodusTeszt() {
        t2.setAlak("négyzet");
        Assertions.assertEquals("négyzet", t2.getAlak(), "Hibás a setAlak() metódus!");
    }

    @Test
    void kremmelMegkenSikeres() throws TortaException{
        try{
            t1.kremmelMegken();
        }catch(TortaException te){
            return;
        }
    }

    @Test
    void kremmelMegkenSikertelen() throws TortaException{
        try{
            t2.kremmelMegken();
        }catch(TortaException te){
            return;
        }
        Assertions.fail("Nem keletkezett TortaException kivétel megkent torta esetén!");
    }

    @Test
    void mennyiKaloriaTeszt() {
        Assertions.assertEquals(2000, t1.mennyiKaloria(), "Helytelen a mennyiKaloria() metódus!");
        Assertions.assertEquals(1000, t3.mennyiKaloria(), "Helytelen a mennyiKaloria() metódus!");
    }

    @Test
    void toStringTeszt() {
        Assertions.assertEquals("{kör;1; false}", t3.toString(), "Helytelen a toString() metódus!");
    }

    @Test
    void parameteresKonstruktorTeszt() {
        Assertions.assertEquals(2, t4.getEmeletSzam(), "Helytelen az emeletek száma paraméteres konstruktor esetén!");
        Assertions.assertEquals("csillag",  t4.getAlak(), "Helytelen az alak paraméteres konstruktor esetén!!");
        Assertions.assertTrue(t4.isKremes(), "Helytelen a krémesség beállítása paraméteres konstruktor esetén!");

    }

    @Test
    void parameterNelkuliKonstruktorTeszt() {
        Assertions.assertEquals(2, t3.getEmeletSzam(), "Helytelen az emeletek száma paraméter nélküli konstruktor esetén!");
        Assertions.assertEquals("csillag",  t3.getAlak(), "Helytelen az alak paraméter nélküli konstruktor esetén!!");
        Assertions.assertTrue(t3.isKremes(), "Helytelen a krémesség beállítása paraméter nélküli konstruktor esetén!");

    }

    @Test
    void parameteresKonstruktorTesztNegativSzam() {
        try{
            t5 = new Torta(-2, true, "csillag");
        }catch(IllegalArgumentException iae){
            return;
        }
        Assertions.fail();
    }
}