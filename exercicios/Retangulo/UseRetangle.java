package exercicios.Retangulo;

import java.util.Scanner;

public class UseRetangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos retângulos deseja calular a área e o perimetro? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a base: ");
            int base = sc.nextInt();
            System.out.print("Digite a altura: ");
            int height = sc.nextInt();
            Retangle retangle = new Retangle(base, height);
            System.out.println(retangle);
        }
        sc.close();
    }
}
