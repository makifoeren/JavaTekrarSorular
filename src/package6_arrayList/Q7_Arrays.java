package package6_arrayList;

public class Q7_Arrays {
    public static void main(String[] args) {


    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */

    int multiArr [][] = {{1,3,6},{2,8},{5,7,9,14}};

        System.out.println(ciftSayilarTopl(multiArr));
    }

    private static int ciftSayilarTopl(int[][] multiArr) {

        int toplam=0;

        for (int i = 0; i <multiArr.length ; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                if (multiArr[i][j] % 2 == 0) {
                    toplam += multiArr[i][j];
                }

            }
        }
            return toplam;
        }
}