import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TortaTest {

    private static Torta t1, t2, t3, t4;



    @BeforeAll
    static void beforeAll() {
        t1 = new Torta(3, true, "négyzet");
        t2 = new Torta(1, false, "háromszög");
        t3 = new Torta(4, false, "hatszög");
    }

    @Test
    void konstruktorTesztNegativSzam() throws IllegalArgumentException{
        try{
            t4 = new Torta(-1, false, "kör");
        }catch(IllegalArgumentException iae){
            return;
        }
        Assertions.fail("Hiba negatív szám megadásakor a konstruktorban!");
    }

    @Test
    void konstruktorTesztAlapertek() {
        Assertions.assertFalse(t2.isKremes(), "Hiba a konstruktorban az isKremes beállításakor!");
        Assertions.assertEquals(3, t1.getEmeletSzam(), "Hiba a konstruktorban az emeletSzam beállításakor!");
        Assertions.assertEquals("hatszög", t3.getAlak(), "Hiba a konstruktorban az alak beállításakor");
    }


}





