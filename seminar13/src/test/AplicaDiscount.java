package test;

import categorii.Categorie1;
import categorii.Categorie2;
import classes.PachetTuristic;
import mocks.FakePersoana;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscount {

    @Tag("tag2")
    @Test
    void poatePrimiDiscount() {
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(65);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "BaileHerculane", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(800, pachetTuristic.getPret());

    }

    @Tag("tag1")
    @Category(Categorie2.class)
    @Test
    void nuPoatePrimiDiscount() {
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(25);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "BaileHerculane", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(800, pachetTuristic.getPret());

    }



}