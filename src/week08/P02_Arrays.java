package week08;

public class P02_Arrays {
    public static void main(String[] args) {
        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        
        int[] arr={2,-5,-3,10,5,3,6,9,-15,20,35};

        System.out.println(arraydakiPozitifSayilariTopla(arr));
    }

    private static int arraydakiPozitifSayilariTopla(int[] arr) {

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                toplam+=arr[i];
            }

        }

        /*
        for (int each:arr
        ) {
            if(each>0){
                toplam+=each;

            }
        }
         */
        return toplam;
    }
}



