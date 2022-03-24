package pl.imiajd.jurewicz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static <G> void redukuj(LinkedList<String> pracownicy, int n){
        for(int i = n-1;i< pracownicy.size();i+=n-1){
            pracownicy.remove(i);
        }
    }
    public static <G> void odwroc(LinkedList<G> lista){
        int j = 0;
        LinkedList<G> odwrocona = new LinkedList<G>();
        odwrocona = (LinkedList)lista.clone();
        for(int i = lista.size() - 1; i >= 0; i--)
        {
            lista.add(j, odwrocona.get(i));
            lista.removeLast();
            j++;
        }
    }
    public static void zad6(int liczba){

        Stack<Integer> stos = new Stack<>();
        while (liczba > 0){
            stos.push(liczba % 10);
            liczba /= 10;
        }
        int rozmiar = stos.size();
        for(int i = 0;i<rozmiar;i++){
            System.out.print(stos.pop() + " ");
        }
    }
    public static <G extends Iterable> void print(G object){
        Iterator<G> krecidelko = object.iterator();
        while(krecidelko.hasNext()){
            System.out.println(krecidelko.next() + ",");
        }
    }
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Marcin");
        pracownicy.add("Paweł");
        pracownicy.add("Andrzej");
        pracownicy.add("Zbyszek");
        pracownicy.add("Stasiek");
        pracownicy.add("Hieronim");
        pracownicy.add("Ksawery");

        System.out.println(pracownicy);
        redukuj(pracownicy, 3);
        System.out.println(pracownicy);
        odwroc(pracownicy);
        System.out.println(pracownicy);
        zad6(2015);

        System.out.println("\n");
        LinkedList<String> lista = new LinkedList<>();
        lista.add("ale");
        lista.add("fajnie");
        lista.add("ze");
        lista.add("mi");
        lista.add("oddziela");
        lista.add("przecinkami");
        lista.add("dzieki temu zaoszczedzilem wiele czasu nie muszac klikac dodatkowego przycisku");
        print(lista);

    }
}
