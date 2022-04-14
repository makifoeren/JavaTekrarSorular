package package5_forLoop;

public class Q2_ForLoop {

    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        for (int i = 0; i <= 255; i++) {
            char harf = (char) i;

            System.out.println(i + " - " + harf);
        }

    }
}
