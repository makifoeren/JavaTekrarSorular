package printf;

public class CarpimTaplosu {

    public static void main(String[] args) {
        /*
        verilen sayilardan carpim tablosu olustrun

        input:5
        output:12345

         */

        int input=5;

        for (int i = 0; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println("");
        }

    }
}
