package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        double[] b = new double[a];

        double c = 0.0;

       for (int d = 0; d < b.length; d++) {
            b[d] = input.nextDouble();
        }
        for (int d = 0; d < b.length; d++) {
            if(b[d]>c){
               c =b[d];
            }
        }
            System.out.println("Max number: "+ c);  
    }
}