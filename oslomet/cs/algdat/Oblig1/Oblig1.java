package cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Oblig1 {
    private Oblig1() {
    }

    //Midlertidig main metode for å teste, fordi testklassene ikke fungerer
    public static void main(String[] args){

    }

    //Edvard
    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new NotImplementedException();
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
    public static void delsortering_ineffektiv(int[] a) {
        //Sjekker om listen er tom
        if(a.length < 1) return;

        //Oppretter midlertidige lister for oddetall og partall
        int[] oddetall = new int[a.length];
        int[] partall = new int[a.length];

        //Startverdi og index for minste tall
        int min = a[0];
        int min_index = 0;

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
        }

        //Midlertidige indexer
        int partall_index = 0;
        int oddetall_index = 0;

        //Går gjennom begge listene og legger de i den originale
        for(int i = 0; i < a.length; i++){
            if(a[i]%2==0){
                partall[partall_index] = a[i];
                partall_index++;
            }
            else{
                oddetall[oddetall_index] = a[i];
                oddetall_index++;
            }
        }

        //Lengden på partallslisten er i utgangspunktet den samme som originallisten
        //Setter denne nå til å være siste index partall-listen fikk.
        int oddetall_length = oddetall_index+1;
        partall_index = 0;
        oddetall_index = 0;

        for(int i = 0; i < a.length; i++){
            if(i < oddetall_length-1){
                a[i] = oddetall[oddetall_index];
                oddetall_index++;
            }
            else{
                a[i] = partall[partall_index];
                partall_index++;
            }
        }

    }

    private static int partition(int[] a, int left, int right){
        int pivot = a[right];
        int index = (left-1);

        for(int i = left; i < right; i++){
            if(a[i] <= pivot){
                index++;

                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[index + 1];
        a[index + 1] = a[right];
        a[right] = temp;

        return index+1;

    }

    private static void quickSort(int[] a, int left, int right){
        if(left >= right) return;

        int partisjon_index = partition(a,left,right);

        quickSort(a,left,partisjon_index-1);
        quickSort(a,partisjon_index+1, right);

    }

    public static void delsortering(int[] a) {
        //Sorting the list first
        quickSort(a,0,a.length-1);

        int index = 0;

        //all odd numbers goes to the left
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;

                index++;

            }
        }
        quickSort(a,index, a.length-1);
    }

    //Benjamin
    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if(a.length < 2) return;

        //Making a hard copy of a
        char[] tempA = new char[a.length];
        for(int i = 0; i < a.length; i++){
            tempA[i] = a[i];
        }

        //Rotating
        for(int i = 0; i < tempA.length-1; i++){
            a[i+1] = tempA[i];
        }

        //Last in array becomes first
        a[0] = tempA[tempA.length-1];

    }

    //Benjamin
    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        if(a.length < 2) return;

        //Making a hard copy of a
        char[] tempA = new char[a.length];
        for(int i = 0; i < a.length; i++){
            tempA[i] = a[i];
        }

        int newIndex;
        for(int i = 0; i < a.length; i++){
            newIndex = i+k;
            if(newIndex < a.length){
                a[newIndex] = tempA[i];
            }
            else{
                a[newIndex-i] = tempA[i];
            }
        }
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
        throw new NotImplementedException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new NotImplementedException();
    }

}  // Oblig1
