package week04;

public class P05_forLoop {
    public static void main(String[] args) {

           /*
                //verilen String'deki kullalanilan harfleri
                // kelimeyi ve tekrarsiz halini yazdirip
                // kelimede kullanilan farkli harf sayisini yazdırın
            */

        String input = "Have a nice day";
        String tekrarsizInput = "";

        String islenecekKelime = input.replaceAll("\\s", "");


        for (int i = 0; i < islenecekKelime.length(); i++) {

            if (!tekrarsizInput.contains(islenecekKelime.substring(i, i + 1))) {

                tekrarsizInput += islenecekKelime.substring(i, i + 1);

            }

        }
        System.out.println(tekrarsizInput);
        System.out.println("Farkli harf sayisi: "+ tekrarsizInput.length());
    }
}