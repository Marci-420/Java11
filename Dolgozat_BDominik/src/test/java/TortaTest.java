import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TortaTest {
    /*
    ujEmelet() metódus + setAlak() metódus - 1 pont *
    kremmelMegken() metódus  - 1 pont
    mennyiKaloria() metódus + toString() metódus - 1 pont *
    konstruktorok - 1 pont*/
    private static Torta t1, t2, t3;

    @BeforeAll
    static void beforeAll() {
        t1 = new Torta("kör", 4 ,true);
        t2 = new Torta();
        t3 = new Torta("hasáb", 2, false);
    }

    @Test
    void ujEmeletMetodusTeszt() {
        t1.ujEmelet();
        Assertions.assertEquals(5, t1.getEmeletek(), "Hiba az ujEmelet() metódusban, nem ad hozzá emeletet!");
    }

    @Test
    void mennyiKaloriaMetodusTeszt() {
        Assertions.assertEquals(1000, t2.mennyiKaloria(), "Hiba a mennyiKaloria() metódusban, nem jó mennyiséget ad vissza krém nélkül!");
        Assertions.assertEquals(8000, t1.mennyiKaloria(), "Hiba a mennyiKaloria() metódusban, nem jó mennyiséget ad vissza krémmel!");
    }

    @Test
    void kremmelMegkenMetodusTeszt() {
        try {
            t1.kremmelMegken();
        } catch (TortaException e) {
            throw new RuntimeException(e);
        }
    }
}