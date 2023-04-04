package week06;

import java.util.Scanner;

public class P01_SayiTahminOyunu {
    /*

            Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
            Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
            bilince de tebrik edip durduran bir kod yazalim

         */
    public static void main(String[] args) {
        int sayi=100;
        System.out.println("Aklimdan bir sayi tuttum.Hadi tahmin et!");
        Scanner scan=new Scanner(System.in);
        boolean dogruMu=false;

        while (!dogruMu){
            int tahmin= scan.nextInt();
            if(sayi<tahmin){
                System.out.println("Cok soyledin,dusur!");
            } else if (sayi>tahmin) {
                System.out.println("Dusuk soyledin,artır!");

            } else if (sayi==tahmin) {
                System.out.println("Tebrikleer!!Sayiyi bildiniz...");
                  //break;
                dogruMu=true;
            }else{
                dogruMu=false;
            }

        }


    }
}
