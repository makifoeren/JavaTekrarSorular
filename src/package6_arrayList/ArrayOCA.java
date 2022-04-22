package package6_arrayList;

import java.util.Arrays;

public class ArrayOCA {

    public static void main(String[] args) {
        int[] random = {16, -41, 112, 10, -110};

        int x = 140;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y); //-6


    }
}