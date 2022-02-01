package pl.imiajd.jurewicz;

import java.time.LocalTime;

public class Z1 {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] tab){
        int poczatek = 0;
        int koniec = tab.length - 1;
        boolean czyPalindrom = false;
        while (poczatek != koniec){
            if (tab[poczatek].compareTo(tab[koniec]) == 0){
                czyPalindrom = true;
                koniec--;
                poczatek++;
            }
            else{
                czyPalindrom = false;
                break;
            }
        }
        return czyPalindrom;
    }
    public static void main(String[] args) {
        LocalTime timeArr[] = {LocalTime.of(12,20),LocalTime.of(13,10),LocalTime.of(12,20)};
        LocalTime timeArr2[] = {LocalTime.of(12,20),LocalTime.of(12,10),LocalTime.of(12,30)};

        Integer intArr[] = {1, 2, 3, 4, 5};
        Integer intArr2[] = {1, 2, 3, 2, 1};


        System.out.println(jestPalindromem(timeArr));
        System.out.println(jestPalindromem(timeArr2));
        System.out.println(jestPalindromem(intArr));
        System.out.println(jestPalindromem(intArr2));



    }
}
