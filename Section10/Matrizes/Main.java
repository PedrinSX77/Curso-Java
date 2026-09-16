package Section10.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da proporção da Matriz: ");
        int n = sc.nextInt();
        int negatives = 0;
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite o numero da linha " + i + " e coluna " + j + ": ");
                int element = mat[i][j] = sc.nextInt();
                if (element < 0)
                    negatives++;
            }
        }

        System.out.println("Main diagonal: ");

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        System.out.print("Negatives Numbers: " + negatives);
        sc.close();
    }
}