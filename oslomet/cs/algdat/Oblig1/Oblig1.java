package cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import com.sun.source.tree.LambdaExpressionTree;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Oblig1 {

    private Oblig1() {
    }

    //Midlertidig main metode for å teste, fordi testklassene ikke fungerer
    public static void main(String[] args){
       System.out.println("gogoer");
        System.out.println(inneholdt("OÅ","BARBARABBAAROKOKOÆÆÆÆÆÆÆÆÆÆÆÅ"));

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
        int ombyttinger = 0;
        int tempValue;
        for(int i=0; i<a.length -1; i++){
            if(a[i] > a[i+1]){
                tempValue = a[i];
                a[i] = a[i+1];
                a[i+1] = tempValue;
                ombyttinger++;
            }
        }
        System.out.println(Arrays.toString(a));
        return ombyttinger;
    }

    //Edvard
    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        if(a.length == 0){
            return 0;
        }
        int antallUlike = 1;
        int størsteTall = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < størsteTall){
                throw new IllegalStateException("Tabellen er ikke sortert");
            }
            else if (a[i] > størsteTall){
                størsteTall = a[i];
                antallUlike++;
            }
        }
        return antallUlike;
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
        //Lager char[] av strengene s og t
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        char[] rchars = new char[s.length() + t.length()];

        int lengdeStoerste = 0;
        int lengdeMinste = 0;
        char[] stoersteArray = new char[0];
        if(s.length() > t.length()) {       //hvis s lengre enn t
            lengdeStoerste = s.length();
            lengdeMinste = t.length();
            stoersteArray = schars;
        } else {                            //hvis t lengre enn s
            lengdeStoerste = t.length();
            lengdeMinste = s.length();
            stoersteArray = tchars;
        }

        for(int i = 0; i < lengdeStoerste; i++) {
            if(lengdeMinste > i) {
                rchars[i * 2] = schars[i];
                rchars[i * 2 + 1] = tchars[i];
            } else {
                rchars[i + lengdeMinste] = stoersteArray[i];
            }
        }
        return String.valueOf(rchars);
    } //flett

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
   /*public static int bokstavNr(char bokstav) {

        if(bokstav == 'A'){
            return 1;
        }if(bokstav == 'B'){
            return 2;
        }if(bokstav == 'C'){
            return 3;
        }if(bokstav == 'D'){
            return 4;
        }
        if(bokstav == 'E'){
            return 5;
        }
        if(bokstav == 'F'){
            return 6;
        }
        if(bokstav == 'G'){
            return 7;
        }
        if(bokstav == 'H'){
            return 8;
        }if(bokstav == 'I'){
            return 9;
        }if(bokstav == 'J'){
            return 10;
        }if(bokstav == 'K'){
            return 11;
        }if(bokstav == 'L'){
            return 12;
        }if(bokstav == 'M'){
            return 13;
        }if(bokstav == 'N'){
            return 14;
        }if(bokstav == 'O'){
            return 15;
        }if(bokstav == 'P'){
            return 16;
        }if(bokstav == 'Q'){
            return 17;
        }if(bokstav == 'R'){
            return 18;
        }if(bokstav == 'S'){
            return 19;
        }if(bokstav == 'T'){
            return 20;
        }if(bokstav == 'U'){
            return 21;
        }if(bokstav == 'V'){
            return 22;
        }if(bokstav == 'W'){
            return 23;
        }if(bokstav == 'X'){
            return 24;
        }if(bokstav == 'Y'){
            return 25;
        }if(bokstav == 'Z'){
            return 26;
        }if(bokstav == 'Æ'){
            return 27;
        }if(bokstav == 'Ø'){
            return 28;
        }if(bokstav == 'Å'){
            return 29;
        }
        return 0;

    }*/

    public static boolean inneholdt(String a, String b) {

        char [] aArray = a.toCharArray();
        char [] bArray = b.toCharArray();
        int [] aCntLetters = new int[29];
        int [] bCntLetters = new int[29];
        int aSum=0;
        int bSum=0;


        for(int i = 0; i < aArray.length; i++){
            leggTilBokstav(aArray[i],aCntLetters);
        }

        for(int i = 0; i < bArray.length; i++){
            leggTilBokstav(bArray[i],bCntLetters);
        }

        for(int i = 0; i < aCntLetters.length; i++){
            if(aCntLetters[i]>bCntLetters[i]){
                return false;
            }
        }
        return true;






        // Må finne ut hvor mange det er av hvert element i aArray

        //Må sjekke om bArray har minst like mange av hvert element

        //Returner false om ikke.

    }

    public static void leggTilBokstav(char bokstav, int [] cntLetter){


            if(bokstav == 'A'){
                cntLetter[0]=cntLetter[0]+1;
            }
            if(bokstav == 'B'){
                cntLetter[1]=cntLetter[1]+1;
            }
            if(bokstav == 'C'){
                cntLetter[2]=cntLetter[2]+1;
            }
            if(bokstav == 'D'){
                cntLetter[3]=cntLetter[3]+1;
            }
            if(bokstav == 'E'){
                cntLetter[4]=cntLetter[4]+1;
            }
            if(bokstav == 'F'){
                cntLetter[5]=cntLetter[5]+1;
            }
            if(bokstav == 'G'){
                cntLetter[6]=cntLetter[6]+1;
            }
            if(bokstav == 'H'){
                cntLetter[7]=cntLetter[7]+1;
            }
            if(bokstav == 'I'){
                cntLetter[8]=cntLetter[8]+1;
            }
            if(bokstav == 'J'){
                cntLetter[9]=cntLetter[9]+1;
            }
            if(bokstav == 'K'){
                cntLetter[10]=cntLetter[10]+1;
            }
            if(bokstav == 'L'){
                cntLetter[11]=cntLetter[11]+1;
            }
            if(bokstav == 'M'){
                cntLetter[12]=cntLetter[12]+1;
            }
            if(bokstav == 'N'){
                cntLetter[13]=cntLetter[13]+1;
            }
            if(bokstav == 'O'){
                cntLetter[14]=cntLetter[14]+1;
            }
            if(bokstav == 'P'){
                cntLetter[15]=cntLetter[15]+1;
            }
            if(bokstav == 'Q'){
                cntLetter[16]=cntLetter[16]+1;
            }
            if(bokstav == 'R'){
                cntLetter[17]=cntLetter[17]+1;
            }
            if(bokstav == 'S'){
                cntLetter[18]=cntLetter[18]+1;
            }
            if(bokstav == 'T'){
                cntLetter[19]=cntLetter[19]+1;
            }
            if(bokstav == 'U'){
                cntLetter[20]=cntLetter[20]+1;
            }
            if(bokstav == 'V'){
                cntLetter[21]=cntLetter[21]+1;
            }
            if(bokstav == 'W'){
                cntLetter[22]=cntLetter[22]+1;
            }
            if(bokstav == 'X'){
                cntLetter[23]=cntLetter[23]+1;
            }
            if(bokstav == 'Y'){
                cntLetter[24]=cntLetter[24]+1;
            }
            if(bokstav == 'Z'){
                cntLetter[25]=cntLetter[25]+1;
            }
            if(bokstav == 'Æ'){
                cntLetter[26]=cntLetter[26]+1;
            }
            if(bokstav == 'Ø'){
                cntLetter[27]=cntLetter[27]+1;
            }
            if(bokstav == 'Å'){
                cntLetter[28]=cntLetter[28]+1;
            }

        }

    }

 // Oblig1
