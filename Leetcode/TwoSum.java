package Leetcode;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int numInicial;
        int numFinal;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] vect = { 2, 5, 11, 7 };
        for (int i = 0; i < vect.length; i++) {
            numInicial = vect[i];
            for (int j = i + 1; j < vect.length; j++) {
                numFinal = vect[j];
                if (numInicial + numFinal == target) {
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }

        sc.close();
    }
}
