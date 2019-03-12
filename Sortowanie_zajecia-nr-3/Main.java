package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // GENEROWANIE
        Random rand = new Random();
        int[] tab2 = new int[10];
        for (int i = 0; i < tab2.length; i++) {
            int val = rand.nextInt(10); // od 0 do 9 <0;10)
            System.out.println(val);
            tab2[i] = val;
        }
/*
        // SORTOWANIE PRZEZ WSTAWIANIE (insert sort)
        for (int i = 0; i < tab2.length-1; i++) { // dlugoscTablicy-1 dlatego ze jak wejdzie na ostatni element tablicy
                                                  //  to tab2[i+1] by wyszlo poza zakres i wyrzucilby wyjatek
            if (tab2[i] > tab2[i+1])
            {
                for (int j = i; j >= 0; j--) {  // schodzenie i sortowanie
                    if (tab2[j] > tab2[j+1])
                    {
                        int temp = tab2[j]; //swapping
                        tab2[j] = tab2[j+1];
                        tab2[j+1] = temp;
                    }
                }
            }
        }
*/
        System.out.println("Wynik");
        //System.out.println(Arrays.toString(insertSort(tab2)));    // z zwracaniem
        //insertSort2(tab2);    // bez zwracania
        System.out.println(Arrays.toString(tab2));
        // oba rezultaty sa posortowane dlatego ze tablica w javie jest juz
        // referencja(wskaznikiem na pamiec gdzie znajduje sie tablica) a typy proste jak bool, int, float itd sa przekazywane poprzez wartosc(kopie)
    }

    public static int[] insertSort(int[] tab){ // metoda statyczna w javie nie ma slowa kluczowego "function" jak np JavaScript,PHP,Lua
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

    public static void insertSort2(int[] tab){ // jezeli dziala na referencji to mozemy zrezygnowac z returna oraz typu zwracanego w metodzie
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