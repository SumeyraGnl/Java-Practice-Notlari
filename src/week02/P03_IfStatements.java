package week02;

import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {

        /*
           1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
              Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
               *** String icin equals method'unu kullanin
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen gün ismi giriniz: ");

        String gun= scan.nextLine();
        gun=gun.toLowerCase();


        if (gun.equals("cumartesi") || gun.equals("pazar") ){
            System.out.println("Hafta sonu");}
        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("carsamba")
                  || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("hafta ici");}
         if (!(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("carsamba")
                 || gun.equals("persembe") || gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar") )) {
             System.out.println("yanlis giris yaptiniz!");
         }






         /*
         Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
          Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
          Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
          küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

          Ad:
          Soyad:
          1.Vize:
          2. Vize:
          Final :
          Yıl Sonu Notu:
          Ders Durumu :

          */

        System.out.print("Lutfen 1.vize notunuzu giriniz: ");
        int vize1= scan.nextInt();
        System.out.print("Lutfen 2.vize notunuzu giriniz: ");
        int vize2= scan.nextInt();
        System.out.println("Lutfen final notunuzu giriniz: ");
        int finalnotu=scan.nextInt();
        int yılSonuNotu=(((vize1+vize2)/2)*40/100)+(finalnotu*60/100);

        if (yılSonuNotu>=50){
            System.out.println("Ders durumu: Gectiniz");
        }
        if (yılSonuNotu<50){
            System.out.println("Ders durumu: Kaldiniz");
        }






    }
}
