package com.company;

public class Main {

    public static void main(String[] args) {
        String szukana = "la ma kota a kot ma ale";
        String przeszukiwana = "la";
        System.out.println(String.format("znaleziono %s na pozycji %d w stringu %s",
                szukana,
                StringUtil.findSubstring(szukana,przeszukiwana),
                przeszukiwana
        ));

        System.out.println(String.format("znaleziono %s na pozycji %d w stringu %s",
                szukana,
                StringUtil.findSubstring2(szukana,przeszukiwana),
                przeszukiwana
        ));




        for ( int i = 0; i < 2140000000; i++ ); // potrzebne na rozgrzanie zegara w procesorze naczej
                                                // pokazuje opoznienia w pierwszej sprawdznej metodzie


        long time = System.nanoTime();
        for ( int i = 0; i < 1000000; i++ ) {
            StringUtil.findSubstring(szukana,przeszukiwana); // pierwszy sposob
        }
        long time2 = System.nanoTime();


        long time3 = System.nanoTime();
        for ( int i = 0; i < 1000000; i++ ) {
            StringUtil.findSubstring2(szukana,przeszukiwana); // drugi sposob
        }
        long time4 = System.nanoTime();

        long time5 = System.nanoTime();
        for ( int i = 0; i < 1000000; i++ ) {
            przeszukiwana.indexOf(szukana); // javowy indexOf
        }
        long time6 = System.nanoTime();

        System.out.println(String.format(
                "czas 1: %d\nczas 2: %d\nczas 3: %d",
                time2-time,
                time4-time3,
                time6-time5
        ));

    }
}
