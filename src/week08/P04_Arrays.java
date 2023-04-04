package week08;

import java.util.Arrays;
import java.util.Scanner;

public class P04_Arrays {
    public static void main(String[] args) {
        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        System.out.println(Arrays.toString(yeniArrayOlustur()));

    }

    public static int[] yeniArrayOlustur() {
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen olusturmak istediginiz Array'in boyutunu giriniz: ");
        int length=scan.nextInt();
        int[] arr=new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Lutfen olusturmak istediginiz array'in elementlerini giriniz:");
            int elenment=scan.nextInt();
            arr[i]=elenment;

        }
        return arr;
    }
}
