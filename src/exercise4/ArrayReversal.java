package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        char[] b = new char[a];
        char[] c = new char[a];
        for (int d = 0; e < b.length; e++) {
            b[e] = input.next().charAt(0);
        }
          int f = 0;
        for (int e = b.length -1; e >= 0; e--) {
                c[f] = b[e];
                f++;
        }
        System.out.println("Reversed symbols: "+Arrays.toString(c));
    }
}