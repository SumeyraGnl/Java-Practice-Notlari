package week05;

import java.util.Scanner;

public class P04_methodCreation {

    // Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    // bolenleri sayisini bulup bize donduren bir method olusturun.

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(pozitifBolenleriBulma(sayi));
        System.out.println(pozitifBolenlerinToplami(sayi));

    }

    public static int pozitifBolenleriBulma(int sayi) {
        int sayac=0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                sayac ++;
            }

        }
        return sayac;
    }

    public static int pozitifBolenlerinToplami(int sayi){

        int toplam=0;

        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0){
                toplam+=i;
            }

        }
        return toplam;
    }


}
