package week03;

import java.util.Scanner;

public class P07_SwichStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

   // Kullanicidan bir rakam alip, rakami yaziyla yazdirin

    //  System.out.print("Lutfen bir rakam giriniz (0 -9 ): ");
    //  int rakam= scan.nextInt();

    //  switch (rakam){
    //      case 0:
    //          System.out.println("sifir"); break;
    //      case 1:
    //          System.out.println("bir"); break;
    //      case 2:
    //          System.out.println("iki"); break;
    //      case 3:
    //          System.out.println("üc"); break;
    //      case 4:
    //          System.out.println("dort"); break;
    //      case 5:
    //          System.out.println("bes"); break;
    //      case 6:
    //          System.out.println("alti"); break;
    //      case 7:
    //          System.out.println("yedi"); break;
    //      case 8:
    //          System.out.println("sekiz"); break;
    //      case 9:
    //          System.out.println("dokuz"); break;
    //      default:
    //          System.out.println("Rakam 0 - 9 arasinda olmalidir.Yanlis deger girdiniz");
    //  }

        // Kullanicidan ay numarasini alip ay ismini yazdirin

    //    System.out.print("Lutfen merak ettiginiz ayin numarasini giriniz: ");
    //    int ay= scan.nextInt();
    //
    //    switch (ay){
    //        case 1:
    //            System.out.println("Ocak"); break;
    //        case 2:
    //            System.out.println("Subat"); break;
    //        case 3:
    //            System.out.println("Mart"); break;
    //        case 4:
    //            System.out.println("Nisan"); break;
    //        case 5:
    //            System.out.println("Mayis"); break;
    //        case 6:
    //            System.out.println("Haziran"); break;
    //        case 7:
    //            System.out.println("Temmuz"); break;
    //        case 8:
    //            System.out.println("Agustos"); break;
    //        case 9:
    //            System.out.println("Eylul"); break;
    //        case 10:
    //            System.out.println("Ekim"); break;
    //        case 11:
    //            System.out.println("Kasim"); break;
    //        case 12:
    //            System.out.println("Aralik"); break;
    //        default:
    //            System.out.println("Hatali giris yaptiniz");
    //
    //
    //    }

        // Kullanicidan ay numarasini alip mevsimini yazdirin

       //    System.out.print("Lutfen mevsimini ogrenmek istediginiz ayin numarasini giriniz: ");
       //    int ayNo= scan.nextInt();
       //    switch (ayNo){
       //        case 12: case 1: case 2:
       //            System.out.println("Mevsim: Kis "); break;
       //        case 3: case 4: case 5:
       //            System.out.println("Mevsim: İlkbahar "); break;
       //        case 6: case 7: case 8:
       //            System.out.println("Mevsim: Yaz "); break;
       //        case 9: case 10: case 11:
       //            System.out.println("Mevsim: Sonbahar ");break;
       //        default:
       //            System.out.println("Hatali giris yaptiniz");
       //    }

        // Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın

        System.out.println("Bilgi istediginiz yili giriniz");
        int yil=scan.nextInt();
        System.out.println("Gun sayisini merak ettiginiz ayin kacinci ay oldugunu giriniz: ");
        int ayNo= scan.nextInt();

        int numdays=0;
        switch (ayNo){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numdays=31;
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
                break;
            case 4: case 6: case 9: case 11:
                numdays=30;
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
                break;
            case 2:
                numdays = ((yil % 4 == 0 && !(yil % 100 == 0) || yil % 400 == 0) ? 29 : 28);
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
                break;
            default:
                System.out.println("Gecersiz ay");


        }





    }
}
