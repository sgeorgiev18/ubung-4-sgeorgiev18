
package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        
        int[] b = new int[a];
        
         
        for (int c = 0; c < b.length; c++) {
          b[c] = input.nextInt();
          
          for (int d = 0 ; d < c; d++) {
             System.out.print(" ");
          }

          System.out.println(b[c]);
        }
    }
}