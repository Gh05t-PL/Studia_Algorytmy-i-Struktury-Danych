package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tab.length; i++) {
            int val = rand.nextInt(10); // od 0 do 9 <0;10)
            System.out.println(val);
            tab[i] = val;
        }

        // znajdz najmniejsza sposob 1
        // SORTOWANIE
        Arrays.sort(tab);
        System.out.println("Najmniejsza liczba to: " + tab[0]); // wybieramy pierwszy element poniewaz
                                                                // sortowanie odbywa sie od najmniejszej do najwiekszej

        // znajdz najmniejsza sposob 2
        // ITERACJA z szukaniem najmniejszej
        int min = tab[0];  // dla min przypisujemy 1-wszy element tablicy
                           // poniewaz gdybysmy dali 0 a zakres losowanych liczb by³by od +2 to najmniejsza liczba by³aby b³êdna

        for (int i = 1; i < tab.length; i++) { // dla i przypisujemy 1 gdyz element 0 juz jest "sprawdzony"
            min = Math.min(min, tab[i]); // metoda min zwraca minimalna wartosc ze swoich parametrow tj. (min, tab[i])
        }
        System.out.println("Najmniejsza liczba to: " + min);

        //--------------------------------------------------------------------------------------


        // GENEROWANIE
        int[] tab2 = new int[10];
        for (int i = 0; i < tab2.length; i++) {
            int val = rand.nextInt(10); // od 0 do 9 <0;10)
            System.out.println(val);
            tab2[i] = val;
        }

        // SORTOWANIE PRZEZ WYBIERANIE
        for (int i = 0; i < tab2.length; i++) {
            int index = i;	
            for (int j = i+1; j < tab2.length; j++) {
                if (tab2[index] > tab2[j]){
                    index = j;
                }
            }
            int temp = tab2[index]; // swapping
            tab2[index] = tab2[i];
            tab2[i] = temp;
        }

        System.out.println("Wynik");
        System.out.println(Arrays.toString(tab2));
        /*
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }
        */



    }
}