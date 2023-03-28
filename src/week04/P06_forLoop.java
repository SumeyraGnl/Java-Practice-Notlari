package week04;

import java.util.Scanner;

public class P06_forLoop {
    public static void main(String[] args) {

        //verilen bir pozitif tam sayinin
        //pozitif tam bolenleriniz yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi<=0){
            System.out.println("yanlıs giris yaptiniz");
        }else {
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    System.out.print(i + " ");
                }

            }

        }

    }
}
