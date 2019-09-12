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
        char[] a0 = {'D','E','A','B','C'};
        Oblig1.rotasjon(a,2);

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
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        assertEquals(true, Oblig1.inneholdt("KORKKOKOGÅ","ÅGMKLSDKASDOKKRGOPKOKOKOKR"), "Implementer inneholdt og denne testen");
    }
}