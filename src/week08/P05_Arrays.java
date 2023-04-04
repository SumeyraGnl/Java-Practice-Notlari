package week08;

public class P05_Arrays {
    public static void main(String[] args) {

        //  Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //  kullanildigini yazdiran bir method olusturun.

        int[] arr= {2,5,4,8,2,15,5,3,5,8};

        istenenElemaniAra(arr,8);

    }

    public static void istenenElemaniAra(int[] arr, int arananeleman) {
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arananeleman){
                sayac++;
            }
        }
        if(sayac!=0){
            System.out.println("Array'de aradiginiz sayı "+sayac+" kere kullanilmistir.");
        }else {
            System.out.println("Array'de aradiginiz sayi bulunmamakatadir.");
        }
    }
}
