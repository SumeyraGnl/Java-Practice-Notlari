package week05;

public class P05_methodCreation {

    // While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
    //yazdirin.

    public static void main(String[] args) {

        int sayi=10;
        String sayilar="";

        while (sayi>=10 && sayi<100){
            if (sayi%7==0){
                sayilar += sayi + " ";
            }
            sayi++;
        }
        System.out.println(sayilar.substring(0,sayilar.length()-1));
    }
}
