package week03;

import java.util.Scanner;

public class P06_TernaryOperator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin,degilse "Eskenar degil" yazdirin

        //System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz,her girisinizde enter tusuna basiniz");
        //System.out.print("1.kenar uzunlugu: ");
        //int knr1= scan.nextInt();
        //System.out.print("2.kenar uzunlugu: ");
        //int knr2= scan.nextInt();
        //System.out.print("3.kenar uzunlugu: ");
        //int knr3= scan.nextInt();
//
        //System.out.println(((knr1 == knr2 && knr2 == knr3 && knr3 > 0) ? "Eskenar ucgen" : "Eskenar ucgen degil"));


        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        olarak yazdirin, yoksa girilen harfi yazdirin
         */

             // System.out.print("Lutfen bir harf giriniz: ");
             // char harf=scan.next().charAt(0);
             // System.out.println(((harf >= 97 && harf <= 122) ? (char) (harf - 32) : harf));
             // System.out.println(harf >= 'a' && harf <= 'z' ? Character.toUpperCase(harf) : harf); //  ==>alternatif
             // System.out.println((harf >= 'a' && harf <= 'z' ? (char)(harf - 32): harf));  //  ==>alternatif


        // Kullanicidan iki adet sayi isteyin ve buyuk olmayan sayiyi yazdirin

             // System.out.println("Lutfen iki sayi girin ");
             // System.out.print("1.sayi: ");
             // double sayi1= scan.nextDouble();
             // System.out.print("2.sayi: ");
             // double sayi2= scan.nextDouble();
             // System.out.println(sayi1>sayi2 ? "Buyuk olmayan sayi: "+sayi2 : "Buyul olmayan sayi: "+sayi1);


        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
        // kucukse "Maalesef kaldin" yazdirin.

        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        System.out.println(not>=50 ? "Sınıfı gectin" : "Maalesef kaldin");
        System.out.println(not>=101 || not <=-1 ? "Yanlış not girdiniz" :not >= 50 ? "Geçtiniz" : "Maalesef Kaldınız");





    }

    }

