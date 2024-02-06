import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MacskaTest {

    private static Macska m1, m2, m3;

    @BeforeAll
    static void beforeAll() {
        m1 = new Macska(5, false);
        m2 = new Macska(0.5);
    }

    @Test
    @Order(1)
    void konstruktorTesztNegativErtek() {
        try{
            m3 = new Macska(-10);
        }
        catch(IllegalArgumentException iae){
            return;
        }
        Assertions.fail("A macska súlya nm lehet negatív!");
    }

    @Test
    @Order(2)
    void konstruktorTesztAlapertelmezettErtek() {
        Assertions.assertEquals(0.5, m2.getSuly(), 0.1, "Helytelen súly beállítás 1 paraméteres konstruktor esetén!");
        Assertions.assertTrue(m2.isEhes(), "Helytelen éhség beállítás 1 paraméteres konstruktor esetén! ");
    }

    @Test
    @Order(3)
    void setSulyMetodusTeszt() {
        m2.setSuly(0.7);
        Assertions.assertEquals(0.7, m2.getSuly(), 0.1, "Helytelen súly beállítás a setSuly() metódusban!!");
    }

    @Test
    @Order(4)
    void setEszikMetodusTeszt() {
        try{
            m2.eszik(0.2);
        }
        catch(IllegalArgumentException iae){
            Assertions.fail(iae.getMessage());
        }
        catch(CatException ce){
            Assertions.fail(ce.getMessage());
        }

        try{
            m1.eszik(0.2);
        }
        catch(IllegalArgumentException iae){
            return;
        }
        catch(CatException ce){
           return ;
        }
        Assertions.fail("Nem keletkezett CatException nem éhes macska etetésekor!");
    }

    @Test
    @Order(5)
    void setEszikMetodusTesztNegativSzam() {
        try{
            m1.eszik(-0.2);
        }
        catch(IllegalArgumentException iae){
            return;
        }
        catch(CatException ce){
            return ;
        }
        Assertions.fail("Nem keletkezett IllegalArgumentException negatív szám esetén!");
    }

    @Test
    @Order(7)
    void futkosMetodusTeszt() {
        try{
            m1.futkos();
            Assertions.assertEquals(4.9, m1.getSuly(), 0.1, "");
            Assertions.assertTrue(m1.isEhes(), "Helytelen éhség beállítás 1 paraméteres konstruktor esetén! ");
        }
        catch(CatException ce){
            Assertions.fail(ce.getMessage());
        }
    }

    void futkosTesztSikertelen() {
        try{
            m1.setSuly(0.1);
            m1.futkos();
        }
        catch(CatException ce){
            return;
        }

        Assertions.fail("Nem keletkezett CatException 0.1 súlyú macskánál a futkos() metódusban! ");
    }
}
