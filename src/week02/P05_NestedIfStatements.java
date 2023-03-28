package week02;

import java.util.Scanner;

public class P05_NestedIfStatements {

    public static void main(String[] args) {
        /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
   Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
   KURALLAR
     : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
     : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ise baslama yilinizi ve ayinizi 1999.09 seklinde giriniz: ");
        double giris= scan.nextDouble();
        if (giris>1999.09){
            System.out.println("Siz EYT Kanun düzenlemesine tabi degilsiniz!");
        }else {
            System.out.println("Lutfen cinsiyetinizi E yada K olarak giriniz: ");
            char cinsiyet=scan.next().charAt(0);

            System.out.println("Lutfen prim gün sayinizi giriniz: ");
            int primGun=scan.nextInt();
            System.out.println("Lutfen hizmet surenizi yil olarak giriniz: ");
            int yil= scan.nextInt();

            if (cinsiyet=='E' || cinsiyet=='e'){
                if (primGun>=5500 && yil>=25){
                    System.out.println("Tebrikler EYT Kanunu yururluge girdigi zaman emekli olabilirsiniz!");
                } else if (primGun<5500 && yil>=25) {
                    System.out.println("Kanun yürürlüge girince "+(5500-primGun)+"gün prim sartini tamamlamaniz gerekmektedir.");
                } else if (primGun>=5500 && yil<25) {
                    System.out.println("Kanun yürürlüge girince "+(25-yil)+"yil daha calismalisiniz.");
                }else {
                    System.out.println("Malesef iki sartida saglamiyorsunuz");
                }


            }
        }








    }
}
