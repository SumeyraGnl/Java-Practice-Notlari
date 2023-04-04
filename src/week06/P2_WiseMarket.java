package week06;

import java.util.Scanner;

public class P2_WiseMarket {

    /*

   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET
   secime gore ,
   4-urunleri listele ve
   5-fiyatlari gelsin

     */

    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static String sepet = "";
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun = false;
    public static void main(String[] args) {

        girisEkrani();



    }

    private static void girisEkrani() {
        System.out.println("========== WİSE MARKET'E HOSGELDİNİZ ==========");
        System.out.println("     -------------- M E N U --------------");
        System.out.println("Lutfen alısveris yapmak istediginiz reyonu seciniz");
        System.out.println("1-MANAV REYONU\n2-SARKUTERI REYONU\n3-MARKET\n4-FIS YAZDIR\n5-CIKIS");
        int secim=scan.nextInt();
        if(!(secim>=1 && secim<=5)){
            System.out.println("Lutfen gercerli bir deger giriniz");
            girisEkrani();
        }else{
            switch (secim){
                case 1:
                    manav();
                    break;
                case 2:
                    //sarkuteri();
                    break;
                case 3:
                   // market();
                    break;
                case 4:
                   // fisYazdir();
                    break;
                case 5:
                    //cikis();
                    break;
                default:
            }
        }

    }

    private static void manav() {
        System.out.println("Lutfen alacaginiz urun kodunu giriniz:\n1-Patates  12₺\n2-Sogan  12₺\n3-Elma  15₺\n4-Portakal  20₺\n5-Ananas  30₺");
        while (!ekUrun){
            urunKodu= scan.nextInt();
           if(urunKodu>=1 && urunKodu<=5){
               System.out.println("Kac kg alacaksiniz?");
               urunAdedi= scan.nextInt();
               switch (urunKodu){
                   case 1:
                       urunAdi="Patates";
                       urunFiyati=12;
                       System.out.println(urunAdedi+" kg "+urunAdi+" fiyati: "+urunFiyati*urunAdedi+" TL'dir.");
                       break;
                   case 2:
                       urunAdi="Sogan";
                       urunFiyati=12;
                       System.out.println(urunAdedi+" kg "+urunAdi+" fiyati: "+urunFiyati*urunAdedi+" TL'dir.");
                       break;
                   case 3:
                       urunAdi="Elma";
                       urunFiyati=15;
                       System.out.println(urunAdedi+" kg "+urunAdi+" fiyati: "+urunFiyati*urunAdedi+" TL'dir.");
                       break;
                   case 4:
                       urunAdi="Portakal";
                       urunFiyati=20;
                       System.out.println(urunAdedi+" kg "+urunAdi+" fiyati: "+urunFiyati*urunAdedi+" TL'dir.");
                       break;
                   case 5:
                       urunAdi="Ananas";
                       urunFiyati=30;
                       System.out.println(urunAdedi+" kg "+urunAdi+" fiyati: "+urunFiyati*urunAdedi+" TL'dir.");
                       break;
               }
               urunFiyati=urunFiyati*urunAdedi;
               toplam+=urunFiyati;
               System.out.println("Olusan sepet tutari: "+toplam);
               sepet+=urunAdi+" : "+urunFiyati+" TL'dir";
               System.out.println(" Başka ürün almak ister misiniz? Eğer başka ürün almak isterseniz lütfen kodunu giriniz!\nAna Menüye dönmek için lütfen 0 (Sıfır) tuşuna basınız");

           }else if(urunKodu==0){
               girisEkrani();
           }
        }


    }
}
