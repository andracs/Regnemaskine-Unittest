package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LommeregnerTest {

    @Test
    public void testPlus2() {
        Lommeregner lommeregner = new Lommeregner();
        int resultat = lommeregner.plus(2, 2);
        assertEquals(4, resultat);
    }

    @Test
    public void testPlus0() {
        Lommeregner lommeregner = new Lommeregner();
        int resultat = lommeregner.plus(0, 0);
        assertEquals(0, resultat);
    }

    // Test for alle edge cases a = 0 1 -1 10 28 023 872314676125476125 10001 -1012912912912912
    // https://www.google.com/search?q=test+edge+cases

    @Test
    public void whenAssertingEquality_thenEqual() {
        String expected = "Baeldung";
        String actual = "Baeldung";

        assertEquals(expected, actual);
    }
}