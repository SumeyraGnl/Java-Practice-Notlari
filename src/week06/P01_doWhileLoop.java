package week06;

public class P01_doWhileLoop {
    public static void main(String[] args) {
        //'k' harfinden 't' harfine kadar harfleri yazdirin.

        char ilkHarf='k';

        do {
            System.out.println(ilkHarf+ " ");
            ilkHarf++;

        }while (ilkHarf<'t');


    }
}
