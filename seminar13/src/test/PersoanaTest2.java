package test;

import Persoana.IPersoana;
import Persoana.Persoana;
import org.junit.jupiter.api.Test;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest2 {

    @Test
    void testGetVarstaRight() {
        IPersoana persoana = new Persoana("Adri", "5010512415523");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryNouNascut() {
        IPersoana persoana = new Persoana("Marcel", "5230523551122");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn2000() {
        IPersoana persoana = new Persoana("Test", "6000101442233");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn1999() {
        IPersoana persoana = new Persoana("Test", "1991231551177");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGetVarstaError() {
        IPersoana persoana = new Persoana("Test", "6230724661122");
        assertThrows(IllegalArgumentException.class, () -> persoana.getVarsta());
    }

    @Test
    void testGetVarstaPerformance() {
        IPersoana persoana = new Persoana("Test", "5010423553344");
        assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @Test
    void testConstructorPersoanaConformance() {
        Persoana persoana = new Persoana("Test", "5010212667788");
        assertEquals(13, persoana.CNP.length());
    }

    @Test
    void testGetVarstaOrder() {
        IPersoana persoana1 = new Persoana("gigi", "5010212667788");
        IPersoana persoana2 = new Persoana("Ion", "5020309558899");
        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @Test
    void testGetVarstaNoCNP() {
        IPersoana persoana = new Persoana(null, null);
        assertThrows(RuntimeException.class, () -> persoana.getVarsta());
    }

    @Test
    void testGetVarstaCardinality() {
        IPersoana persoana = new Persoana("Test", " 5220523446767");
        assertEquals(1, persoana.getVarsta());
    }

}