package week04;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bir String isteyin ve String'i tersine cevirip
        kaydedin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime= scan.nextLine();

        String tersKelime="";

        for (int i = kelime.length()-1; i >=0; i--) {

            tersKelime += kelime.charAt(i);

        }
        System.out.println("Girilen kelimenin tersi: " + tersKelime);

    }
}
