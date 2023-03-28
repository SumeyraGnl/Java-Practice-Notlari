package week02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {

        // İnt olarak verilen 3 sayinin toplamini double olarak yazdirin
        // ipucu : double>float

        int a=3, b=9, c=7;
        int toplam=a+b+c;  //  ==>direk    double toplam=a+b+c  'de yazdırabiliriz
        System.out.println("toplam: " +(double)toplam);
        /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
           Girdiğiniz harf :
           Girdiğiniz harften sonraki  3 harf :
              şeklinde yazdrın.
             ipucu: char
         */

        Scanner scan=new Scanner(System.in);
         //System.out.print("Lutfen bir harf giriniz: ");
         //char harf=scan.next().charAt(0);
         //System.out.println("Girdiginiz harf: " +harf);
         //System.out.println("Girdiginiz harften sonraki 3 harf: " +(char)(harf+1)+", " + (char)(harf+2)+", "+ (char)(harf+3));

       /*
       3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
          sonucu tam sayı yazdırın
          ipucu: sorumluluk bende
        */

        System.out.println("Lütfen iki adet ondalikli sayi giriniz.");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        int sonuc= (int)(sayi1/sayi2);

        System.out.println(sonuc);


    }
}
