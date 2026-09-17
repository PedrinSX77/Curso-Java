package exercicios.Matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de linhas: ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int n = sc.nextInt();

        int[][] list = new int[m][n];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print("Digite o numero da linha " + i + " e coluna " + j + ": ");
                list[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o numero que quer buscar seus vizinhos: ");
        int number = sc.nextInt();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                int indice = list[i][j];
                if (indice == number) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Vizinho a esquerda: " + list[i][j - 1]);
                    }
                    if (j < list[i].length - 1) {
                        System.out.println("Vizinho a direita: " + list[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Vizinho acima: " + list[i - 1][j]);
                    }
                    if (i < list.length - 1) {
                        System.out.println("Vizinho abaixo: " + list[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
