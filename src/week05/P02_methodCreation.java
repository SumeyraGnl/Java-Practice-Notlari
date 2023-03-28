package week05;

import java.util.Scanner;

public class P02_methodCreation {

    static String duzenliStr="";


        // Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz: ");
        String name = scan.nextLine();
        System.out.println();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String surname = scan.nextLine();

        System.out.println(isimSoyisimYazdir(name, surname));

    }

    public static String isimSoyisimYazdir(String name, String surname) {
        name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();
        duzenliStr=name+" "+ surname;
        return duzenliStr;
    }
}
