package package5_forLoop;

public class Q9 {

    /*
C
O O
D D D
E E E E
R R R R R

    */
    public static void main(String[] args) {


        String str = "CODER";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
        }

    }
}
