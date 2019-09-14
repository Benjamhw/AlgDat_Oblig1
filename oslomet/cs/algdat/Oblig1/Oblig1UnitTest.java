package cs.algdat.Oblig1;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        int[] testTabell = {6,9,12,1,3,36,7,-1};
        assertEquals(36, Oblig1.maks(testTabell));
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        int[] testTabell = {6,9,12,1,3,36,7,-1};
        assertEquals(4, Oblig1.ombyttinger(testTabell));
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        int[] testTabell = {1,1,1,2,2,3,3,4,7};
        assertEquals(5, Oblig1.antallUlikeSortert(testTabell));
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        assertEquals(true, false, "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        int[] a = {3,5,2,6,7,8,1,4,9};
        int[] expected = {1,3,5,7,9,2,4,6,8};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(expected), Arrays.toString(a), "Implementer delsortering og denne testen");

        System.out.println(Arrays.toString(a));
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {

        char[] a = {'A','B','C','D','E'};
        char[] a0 = {'B','C','D','E','A'};
        Oblig1.rotasjon(a,-1);

        assertEquals(Arrays.toString(a0), Arrays.toString(a), "Implementer rotasjon og denne testen");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        assertEquals(true, false, "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        assertEquals(true, false, "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        int [] test1 = {0,0,12,13,67,89,999,1,2,0};
        int [] forventet1 = {0,1,9};
        int [] test2 = {0,0,0};
        int [] forventet2 = {0,1,2};
        int [] test3 = {1,3,2};
        int [] forventet3 = {0,2,1};
        int [] test4 = {1000,90,12,13,67,1,89,999,69,420,0,99,123,2,3};
        int [] forventet4 = {10,5,13};


        assertEquals(Arrays.toString(forventet1), Arrays.toString(Oblig1.tredjeMin(test1)), "Test 1");
        assertEquals(Arrays.toString(forventet2), Arrays.toString(Oblig1.tredjeMin(test2)), "Test 2");
        assertEquals(Arrays.toString(forventet3), Arrays.toString(Oblig1.tredjeMin(test3)), "Test 3");
        assertEquals(Arrays.toString(forventet4), Arrays.toString(Oblig1.tredjeMin(test4)), "Test 4");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {

        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        assertEquals(true, Oblig1.inneholdt("KORKKOKOGÅ","ÅGMKLSDKASDOKKRGOPKOKOKOKR"), "NR 1");
        assertEquals(true, Oblig1.inneholdt("","ÅGMKLSDKASDOKKRGOPKOKOKOKR"), "NR 2");
        assertEquals(false, Oblig1.inneholdt("KORKKOKOGÅPIZZA","ÅGMKLSDKASDOKKRGOPKOKOKOKR"), "NR 3");
        assertEquals(true, Oblig1.inneholdt("Ø","ÅGMKLSDKASDOKKRGOPKOKOKOKRADSØ"), "NR 4");
    }
}