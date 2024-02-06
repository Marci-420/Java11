import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private static Rectangle t1, t2, t3, t4, t5;

    @BeforeAll
    static void beforeAll() {
        t1 = new Rectangle(4, 4);
        t2 = new Rectangle(1.68, 4.93);
        t3 = new Rectangle();
        t4 = new Rectangle(10, 3);
        t5 = new Rectangle(11, 20);
        t5.setB(21);
    }

    @Test
    void keruletTeszt() {
        Assertions.assertEquals(16.0, t1.getKerulet(), 0.1, "Hibás a kerület egész számra!");
        Assertions.assertEquals(13.22, t2.getKerulet(), 0.01, "Hibás a kerület valós számra!");
        Assertions.assertEquals(0, t3.getKerulet(), "Hibás a kerület a felültöltött konstruktorra!");
        Assertions.assertEquals(26, t4.getKerulet(), "Hibás a kerület negatív számra!");
    }

    @Test
    void getAMetodusTeszt() {
        Assertions.assertEquals(4, t1.getA(), "Hibás a getA() metódus egész szám esetén!");
        Assertions.assertEquals(1.68, t2.getA(), "Hibás a getA() metódus valós szám esetén!");
        Assertions.assertEquals(0, t3.getA(), "Hibás a getA() metódus felültöltött konstruktor esetén!");
    }

    @Test
    void getBMetodusTeszt() {
        Assertions.assertEquals(4, t1.getB(), "Hibás a getB() metódus egész szám esetén!");
        Assertions.assertEquals(4.93, t2.getB(), 0.01,  "Hibás a getB() metódus valós szám esetén!");
        Assertions.assertEquals(0, t3.getB(), "Hibás a getB() metódus felültöltööt konstruktor esetén!");
    }

    @Test
    void isNegyzetMetodusTeszt() {
        Assertions.assertTrue(t1.isNegyzet(), "Nem négyzetet ad egyenlő értékek esetén!");
        Assertions.assertFalse(t2.isNegyzet(), "Négyzetet ad nem egyenlő értékek esetén!");
    }

    @Test
    void setAMetodusTeszt() {
        t4.setA(5.7);
       Assertions.assertEquals(5.7, t4.getA(), 0.1, "Hibás a setA() metódus valós szám esetén! ");
       t4.setA(5);
        Assertions.assertEquals(5.0, t4.getA(), 0.1, "Hibás a setA() metódus egész szám esetén! ");
    }

    @Test
    void setBMetodusTeszt() {
        Assertions.assertEquals(21, t5.getB(), "Hibás a setB() metódus egész szám esetén!");
    }

    @Test
    void getNagyobbMetodusTesz() {
        Assertions.assertSame(t1,t3.getNagyobb(t1, t2), "Hibás a getNagyobb() metódus!");
        Assertions.assertNotEquals(t4, t1.getNagyobb(t4, t5), "Hibás a getNagyobb() metódus!");
    }

    @Test
    void getTeruletMetodusTeszt() {
        Assertions.assertEquals(16.0, t1.getTerulet(), 0.1, "Hibás a terület egész számra!");
        Assertions.assertEquals(8.2824, t2.getTerulet(), 0.0001, "Hibás a terület valós számra!");
        Assertions.assertEquals(0, t3.getTerulet(), "Hibás a terület felültöltött konstruktor esetén!");
        Assertions.assertEquals(30, t4.getTerulet(), "Hibás a terület negatív számra!");
    }
}