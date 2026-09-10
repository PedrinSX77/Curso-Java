package Section6.For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de entradas: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número para entrada: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.printf("Soma do total das entradas é igual a: " + soma);
        sc.close();
    }
}
