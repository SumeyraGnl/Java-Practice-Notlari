package week05;

import java.util.Scanner;

public class P01_methodCreation {

    static String output = "";

    public static void main(String[] args) {

        // Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //mesaji verin
        //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        //yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz");
        String input = scan.nextLine();

        stringdekiHarfleriYazdir(input, 5, 20);

    }

    public static void stringdekiHarfleriYazdir(String input, int index1, int index2) {


        if (index1 > index2) {

            System.out.println("HATA: baslangıc degeri bitis degerinden buyuk olamaz");

        } else if (index1 > input.length() - 1 || index2 > input.length() - 1) {

            System.out.println("HATA: Girilen değer stringin sınırları dışında bir değerdir.");

        } else {
            input = input.replace(" ", "");

            for (int i = index1; i < index2; i++) {

                output += input.charAt(i) + ",";
            }

            System.out.println(output);


        }
    }
}