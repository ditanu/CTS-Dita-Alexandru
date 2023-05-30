package test;

import categorii.Categorie1;
import categorii.Categorie2;
import classes.IPersoana;
import classes.PachetTuristic;
import mocks.StubPersoana;
import mocks.StubPersoanaMinora;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicTest {

    @Tag("tag1")
    @Test
    void poateRezervaPachet() {
        IPersoana stubPersoana = new StubPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoana, "Dubai", 1500.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void nuPoateRezervaPachet() {
        IPersoana stubPersoanaMinora = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoanaMinora, "Romania", 2500.5);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void aplicaDiscount() {

    }


}