package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // GENEROWANIE
        Random rand = new Random();
        int[] tab = new int[10];
        int[] tab2 = new int[10];
        for (int i = 0; i < tab2.length; i++) {
            int val = rand.nextInt(10); // od 0 do 9 <0;10)
            System.out.println(val);
            tab2[i] = val;
        }

        // SORTOWANIE BABELKOWE (bubble sort) implementacja na zajeciach zoptymalizowany poprzez ifa wlasciwa implementacja go nie posiada
        for (int i = 0; i < tab.length-1; i++) { // dlugoscTablicy-1 dlatego ze jak wejdzie na ostatni element tablicy
                                                  //  to tab[i+1] by wyszlo poza zakres i wyrzucilby wyjatek
            if (tab[i] > tab[i+1])
            {
                for (int j = i; j >= 0; j--) {  // schodzenie i sortowanie
                    if (tab[j] > tab[j+1])
                    {
                        int temp = tab[j]; //swapping
                        tab[j] = tab[j+1];
                        tab[j+1] = temp;
                    }
                }
            }
        }


        // SORTOWANIE PRZEZ WSTAWIANIE (insert sort) implementacja wlasciwa(z neta)
        for (int i=1; i<tab2.length; ++i)
        {
            int value = tab2[i]; // zmienna pomocnicza
            int j = i-1;

            while (j>=0 && tab2[j] > value) // sprawdzanie czy j jest juz na 0 i porownanie elementu w indeksie "j" do value
            {
                tab2[j+1] = tab2[j]; // przesuniecie elementow czyli zrobienie miejsca dla elementu trzymanego w pomocniczej zmiennej "value"
                j--; // zejscie
            }
            tab2[j+1] = value; // Wstawienie
        }

        System.out.println("Wynik");
        //System.out.println(Arrays.toString(insertSort(tab2)));    // ze zwracaniem
        //insertSort2(tab2);    // bez zwracania
        System.out.println(Arrays.toString(tab2));
        // oba rezultaty sa posortowane dlatego ze tablica w javie jest juz przekazywana jako
        // REFERENCJA(wskaznikiem na pamiec gdzie znajduje sie tablica) a typy proste jak bool, int, float itd sa przekazywane poprzez WARTOSC(kopie)
    }

    public static int[] insertSort(int[] tab){ // [metoda statyczna] w javie nie ma slowa kluczowego "function" jak np w JavaScript,PHP,Lua
                                                // wiec nie mozna utworzyc funkcji dlatego robimy metode statyczna
                                                // co oznacza ze cos jest statyczne? pola i metody statyczne w klasie sa atrybutami klasy nie INSTANCJI KLASY(obiektu)
                                                // tzn ze nie musimy konkretyzowac obiektu(tworzyc instancje za pomoca operatora "new") by wywolac metode badz odwolac sie do pola
        for (int i = 0; i < tab.length-1; i++) {
            if (tab[i] > tab[i+1])
            {
                for (int j = i; j >= 0; j--) {
                    if (tab[j] > tab[j+1])
                    {
                        int temp = tab[j];
                        tab[j] = tab[j+1];
                        tab[j+1] = temp;
                    }
                }
            }
        }
        return tab;
    }

    public static void insertSort2(int[] tab){ // jezeli dziala na referencji to mozemy zrezygnowac z return'a oraz typu zwracanego w metodzie jest to zmiana tylko kosmetyczna a z return'em jest wygodniejsze uzycie
        for (int i = 0; i < tab.length-1; i++) {
            if (tab[i] > tab[i+1])
            {
                for (int j = i; j >= 0; j--) {
                    if (tab[j] > tab[j+1])
                    {
                        int temp = tab[j];
                        tab[j] = tab[j+1];
                        tab[j+1] = temp;
                    }
                }
            }
        }
    }
}