package Section10;

import java.util.Locale;
import java.util.Scanner;

import Section10.Entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade a ser cadastrada de produtos: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do Produto: ");
            String name = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }
        double avg = (n == 0) ? 0.0 : sum / n;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}