package week03;

import java.util.Scanner;

public class P08_StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Kullanicidan isim ve soyismini ayri ayri alin.
        // ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        // yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        // harflerle yazdirin

        //    System.out.print("Lutfen isminizi giriniz: ");
        //    String isim= scan.next();
        //    System.out.print("Lutfen soyisminizi giriniz: ");
        //    String soyIsim=scan.next();
        //    if (isim.length()>soyIsim.length()){
        //        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        //        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();
        //        System.out.println(isim+" "+soyIsim);

        //    }

        //    if (isim.length()<soyIsim.length()){
        //        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        //          //name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
        //        soyIsim=soyIsim.toUpperCase();
        //        System.out.println(isim+" "+soyIsim);

        //    }

                 /*
                   Kullanicidan bir cumle alin
               - cumlede ev geciyorsa, "home home sweet home" yazdirin
               - cumlede is geciyorsa, "calismak guzeldir"
               - ikisini de iceriyorsa "Hem ev lazim hem is"
               - hicbirini icermiyorsa "cok calisman lazim" yazdirin.

                  */
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle= scan.nextLine();
        cumle=cumle.toLowerCase();
        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");

        }else {
            System.out.println("cok calisman lazim");
        }

    }
}
