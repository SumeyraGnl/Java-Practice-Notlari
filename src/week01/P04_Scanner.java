package week01;

import java.util.Scanner;

public class P04_Scanner {

    /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz: ");
        String name=scan.next();
        System.out.println("Lutfen soyadinizi giriniz: ");
        String surname=scan.next();
        System.out.println("Lutfen yasinizi giriniz: ");
        String  age=scan.next();
        System.out.println("E-posta adresinizi giriniz: ");
        String mail=scan.next();
        System.out.println("Lutfen sifrenizi giriniz: ");
        String password=scan.next();
        System.out.println("*****       KAYIT BAŞARILI      *****"+"\nAdiniz: " +name+
                "\nSoyadiniz: " +surname+ "\nYasiniz: " +age+
                "\nMail Adresiniz: " +mail+"\nSifreniz: " +password);

          //bu sekilde tek bir satırda da yazılabilir, ayrı ayrı da yazdırılabilir

             //System.out.println("Adiniz: " +name);
            //System.out.println("Soyadiniz: " +surname);
            //System.out.println("Yasiniz: " +age);
            //System.out.println("Mail Adresiniz: " +mail);
            //System.out.println("Sifreniz: " +password);


        System.out.println(name.charAt(0) +'.' + surname + ", " + age);

    }
}
