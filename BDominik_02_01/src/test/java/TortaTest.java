import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TortaTest {
    private static Torta t1, t2, t3, t4, t5;

    @BeforeAll
    static void beforeAll() {
        t1 = new Torta();
        t2 = new Torta(2, true, "csillag");
        t3 = new Torta();
        t4 = new Torta(3, true, "négyzet");
    }

    @Test
    void ujEmeletMetodusTeszt() {
        t2.ujEmelet();
        Assertions.assertEquals(3, t2.getEmeletekSzama(), "Hibás az ujEmelet() metódus");
    }

    @Test
    void setAlakTeszt() {
        t2.setAlak("kör");
        Assertions.assertEquals("kör", t2.getAlak(), "Hibás a setAlak() metódus");
    }

    @Test
    void kremmelMegkenSikertelen(){
        try {
            t2.kremmelMegken();
        } catch (TortaException te) {
            return;
        }
        Assertions.fail("Hibás a kremmelMegken() metódus krémes torta esetén!");
    }

    @Test
    void kremmelMegkenSikeres(){
        try {
            t1.kremmelMegken();
        } catch (TortaException te) {
            Assertions.fail(te.getMessage());
        }
    }

    @Test
    void mennyiKaloriaTeszt() {
        Assertions.assertEquals(1000, t3.mennyiKaloria(), "Hibás a mennyiKaloria() metódus nem krémes torta esetén!");
        Assertions.assertEquals(6000, t4.mennyiKaloria(), "Hibás a mennyiKaloria() metódus krémes torta esetén!");
    }

    @Test
    void toStringTeszt() {
        Assertions.assertEquals("{kör;1;false}", t3.toString(), "Hibás a toString() metódus!");
    }

    @Test
    void parameterNelkuliKonstruktorTeszt() {
        Assertions.assertEquals(1, t3.getEmeletekSzama(), "Hibás az emeletek száma paraméter nélküli konstruktor esetén!");
        Assertions.assertEquals("kör", t3.getAlak(), "Hibás az alak beállítás paraméter nélküli konstruktor esetén!");
        Assertions.assertFalse(t3.isKremes(), "Hibás a krémesség beállítása paraméter nélküli konstruktor esetén!");
    }

    @Test
    void parameteresKonstruktorTeszt() {
        Assertions.assertEquals(3, t4.getEmeletekSzama(), "Hibás az emeletek száma paraméteres konstruktor esetén!");
        Assertions.assertEquals("négyzet", t4.getAlak(), "Hibás az alak beállítás paraméteres konstruktor esetén!");
        Assertions.assertTrue(t4.isKremes(), "Hibás a krémesség beállítása paraméteres konstruktor esetén!");
    }

    @Test
    void parameteresKonstruktorTesztNegativ() {
        try{
            t5 = new Torta(-5, true, "kör");
        }catch (IllegalArgumentException iae){
            return;
        }
        Assertions.fail("Nem keletkezett IllegalArgumentException negatív emelet esetén!");
    }
}
