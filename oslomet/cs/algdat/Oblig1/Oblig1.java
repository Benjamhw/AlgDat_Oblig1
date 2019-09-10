package cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class Oblig1 {

    private Oblig1() {
    }

    //Midlertidig main metode for å teste, fordi testklassene ikke fungerer
    public static void main(String[] args){
       System.out.println("gogoer");
        System.out.println(inneholdt("","BARBARABBAAROKOKO"));

    }

    //Edvard
    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if(a.length == 0){
            throw new NoSuchElementException("Tabellen er tom!");
        }
        int tempValue;
        for(int i=0; i<a.length -1; i++){
            if(a[i] > a[i+1]){
               tempValue = a[i];
               a[i] = a[i+1];
               a[i+1] = tempValue;
            }
        }
        System.out.println(Arrays.toString(a));
        return a[a.length-1];
    }

    public static int ombyttinger(int[] a) {
        throw new NotImplementedException();
    }

    //Edvard
    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new NotImplementedException();
    }

    //Edvard
    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new NotImplementedException();
    }

    //Benjamin
    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        if(a.length < 1) return;
        int[] oddetall = new int[a.length];
        int[] partall = {};
        int min = a[0];
        int min_index = 0;
        // {4,1,-7,2,-3};


        //Sorterer listen
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i; j < a.length; j++){
                if(a[j] < min){
                    min = a[j];
                    min_index = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[min_index] = temp;

            min = a[i + 1];
            min_index = i + 1;

            System.out.println(Arrays.toString(a));
        }

        for(int i = 0; i < a.length; i++){
            if(a[i]%2==0){
            }
        }

    }

    //Benjamin
    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new NotImplementedException();
    }

    //Benjamin
    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new NotImplementedException();
    }

    //Aslak
    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new NotImplementedException();
    }

    //Aslak
    /// 7b)
    public static String flett(String... s) {
        throw new NotImplementedException();
    }

    //Aslak
    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new NotImplementedException();
    }

    //Jacob
    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new NotImplementedException();
    }

    //Jacob
    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {

        if(bokstav == 'A'){
            return 2;
        }
        if(bokstav == 'B'){
            return 3;
        }
        if(bokstav == 'C'){
            return 5;
        }
        if(bokstav == 'D'){
            return 7;
        }
        if(bokstav == 'E'){
            return 11;
        }
        if(bokstav == 'F'){
            return 13;
        }
        if(bokstav == 'G'){
            return 17;
        }
        if(bokstav == 'H'){
            return 19;
        }if(bokstav == 'I'){
            return 23;
        }if(bokstav == 'J'){
            return 29;
        }if(bokstav == 'K'){
            return 31;
        }if(bokstav == 'L'){
            return 37;
        }if(bokstav == 'M'){
            return 41;
        }if(bokstav == 'N'){
            return 43;
        }if(bokstav == 'O'){
            return 47;
        }if(bokstav == 'P'){
            return 53;
        }if(bokstav == 'Q'){
            return 59;
        }if(bokstav == 'R'){
            return 61;
        }if(bokstav == 'S'){
            return 67;
        }if(bokstav == 'T'){
            return 71;
        }if(bokstav == 'U'){
            return 73;
        }if(bokstav == 'V'){
            return 79;
        }if(bokstav == 'W'){
            return 83;
        }if(bokstav == 'G'){
            return 89;
        }if(bokstav == 'Y'){
            return 97;
        }if(bokstav == 'Z'){
            return 101;
        }if(bokstav == 'Æ'){
            return 103;
        }if(bokstav == 'Ø'){
            return 107;
        }if(bokstav == 'Å'){
            return 109;
        }
        return 1;

    }

    public static boolean inneholdt(String a, String b) {

        char [] aArray = a.toCharArray();
        char [] bArray = b.toCharArray();
        long aSum = 1;
        long bSum = 1;
        if(aArray.length>bArray.length){
            return  false;
        }

        for(int i = 0; i < aArray.length; i++){
            aSum= aSum * bokstavNr(aArray[i]);
        }

        for(int i = 0; i < bArray.length; i++){
            bSum= bSum * bokstavNr(bArray[i]);
        }

        if(bSum%aSum==0){
            return true;
        }
        else{
            return false;
        }





        // Må finne ut hvor mange det er av hvert element i aArray

        //Må sjekke om bArray har minst like mange av hvert element

        //Returner false om ikke.

    }

}  // Oblig1
