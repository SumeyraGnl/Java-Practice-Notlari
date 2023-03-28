package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alıp ücüncü bir degisken kullanmadan sayi degerlerini degistirin (swap)
                 /*
            a=20            b=10
            a=a+b  ==> a artık 30,  b hala 10
            b=a-b  ==> b artik 20 oldu, a 30
            a=a-b  ==> a artik 10 oldu

                */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki adet sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("1.sayi: "+sayi1+ "\n2.sayi: " +sayi2);
        System.out.println("***** hokus pokus ******");
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("1.sayi: "+sayi1+ "\n2.sayi: " +sayi2);



    }


}
