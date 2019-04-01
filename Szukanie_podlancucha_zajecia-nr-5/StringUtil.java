package com.company;

public class StringUtil {
    public static int findSubstring(String needle, String haystack) {
        for ( int i = 0; i < haystack.length(); i++ ) {
            if ( haystack.charAt(i) == needle.charAt(0) ) {
                int j = 1; // jezeli znaleziono na pozycji 0 czyli pierwszej bo indeksujemy zawsze od 0
                           // to przechodzimy do drugiej czyli 0+1=1 zmienna j jest indeksem
                           // Stringa mozemy zinterpretowac jako tablice liter a by wyłuskać wartość
                            // na zadanej pozycji swtosujemy metode .charAt()
                while ( (i + j) < haystack.length() && haystack.charAt(i + j) == needle.charAt(j) ) {
                     // (i + j) < haystack.length() odpowiada za sprawdzanie czy nie wychodzi poza zakres
                    // haystack.charAt(i + j) == needle.charAt(j) sprawdza czy kolejne po sobie litery tablicy znakow w tej ITERACJI sa rowne
                    if ( j == needle.length() - 1 )
                        return i;
                    j++;
                }
            }
        }
        return -1;
    }

    public static int findSubstring2(String needle, String haystack) {
        for ( int i = 0; i < haystack.length()-needle.length()+1; i++ ) {
            //System.out.println(haystack.substring(i, needle.length()).equals(needle));
            if ( haystack.substring(i, i+needle.length()).equals(needle) ) // tniemy stringa na mozliwe do sprawdzenia kombinacje ROWNYCH dlugosci
                return i;
        }
        return -1;
    }
}
