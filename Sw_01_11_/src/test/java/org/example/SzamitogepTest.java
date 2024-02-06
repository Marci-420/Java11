package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SzamitogepTest {
    private static Szamitogep sz1, sz2;

    @BeforeAll

    static void beforeAll() {
        sz1 = new Szamitogep();
        sz2 = new Szamitogep(4096, true);
    }



    @Test
    @Order(1)
    void parameterNelkuliKonstruktorTeszt() {
        Assertions.assertEquals(8192, sz1.getMB(), "Helytelen a memória alapértéke paraméter nélküli konstruktor esetén!");
        Assertions.assertFalse(sz1.isOn(), "Nincs kikapcsolva a számító paraméter nélküli konstruktor esetén!");

    }

    @Test
    @Order(2)
    void kapcsolTesztTrue() {
        sz1.kapcsol();
        Assertions.assertTrue(sz1.isOn(), "Nem kapcsol be a kapcsol metódus!");
    }

    @Test
    @Order(3)
    void kapcsolTesztFalse() {
        sz1.kapcsol();
        Assertions.assertFalse(sz1.isOn(), "Nem kapcsol ki a kapcsol metódus!");
    }

    @Test
    @Order(5)
    void programMasolTesztFail() {
        try{
            sz2.programMasol(5000);
        }
        catch(IllegalArgumentException iae){
            return;
        }
        catch(ComputerMemoryException cme){
            return;
        }
        Assertions.fail("Nem keletkezett másolási hiba!");
    }

    @Test
    @Order(6)
    void programMasolTesztSuccess() {
        try{
            sz2.programMasol(100);
        }
        catch(IllegalArgumentException iae){
            Assertions.fail(iae.getMessage());
        }
        catch(ComputerMemoryException cme){
            Assertions.fail(cme.getMessage());
        }
    }

    @Test
    @Order(7)
    void programMasolTesztNegativErtek() {
        try{
            sz2.programMasol(-100);
        }
        catch(IllegalArgumentException iae){
            return;
        }
        catch(ComputerMemoryException cme){
           return;
        }
        Assertions.fail("Nem keletkezett negatív érték esetén kivétel!");
    }

    @Test
    @Order(4)
    void toStringTest() {
        Assertions.assertEquals("[8192 MB, 8192 MB, false]", sz1.toString(), "Helytelen a toString() metódus kimenetele!" );
    }

    @Test
    @Order(8)
    void getMBMetodusTest() {
        Assertions.assertEquals(3996.0, sz2.getMB(), 0.1, "Hiba a getMB() metódus működésében!");
    }

    @Test
    @Order(10)
    void isOnMetodusTestTrue() {
        Assertions.assertTrue(sz2.isOn(), "Hiba az isOn() metódus működésében!");
    }

    @Test
    @Order(9)
    void isOnMetodusTestFalse() {
        Assertions.assertFalse(sz1.isOn(), "Hiba az isOn() metódus működésében!");
    }

    @Test
    void setOnMetodusTest() {
        sz2.setOn(false);
        Assertions.assertFalse(sz1.isOn(), "Hiba a setOn() metódus működésében!");
    }
}