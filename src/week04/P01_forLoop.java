package week04;

public class P01_forLoop {
    public static void main(String[] args) {
        /*
           Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
           dahil) 7 ila bolunebilen sayilari yazdirin.
        */

        int sayi=165;
        for (int i = 1; i < sayi; i++) {

            if (i%7==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println("");
        System.err.println("====== ISLEM TAMAMLANDI ======="); // ===> out yerine err yazdirirsak kirmizi yazdirir

    }
}
