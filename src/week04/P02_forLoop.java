package week04;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {

       /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
      */

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir baslangic degeri giriniz: ");
        int baslangic= scan.nextInt();
        System.out.print("Bir bitis degeri giriniz: ");
        int bitis= scan.nextInt();

        int toplam=0;
        if (bitis<baslangic){
            System.err.println("===  Baslangic degeri bitis degerinden kucuk olmalidir  ===");
        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;


            }
            System.out.println("Degerler toplami:" +toplam);


        }



    }
}