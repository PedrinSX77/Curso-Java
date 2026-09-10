package Section6.While;

import java.util.Scanner;

// Estrutura enquanto/while no Java
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int x = sc.nextInt();
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("Encerrando programa...");
        System.out.println(soma);
        sc.close();
    }
}