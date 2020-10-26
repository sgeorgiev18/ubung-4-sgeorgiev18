package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); 
        double[] b = new double[a];
        double c =10000000;
        int d =0;   
       for (int e = 0; e < b.length; e++) {
            b[e] = input.nextDouble();
        }
        for (int e = 0; e < b.length; e++) {
            if(b[e]<c){
               c = b[e];
                d = e;
            }
        }
            System.out.println("Min index: " + d);  
    }
}