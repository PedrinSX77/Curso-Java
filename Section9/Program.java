package Section9;

import java.util.Locale;
import java.util.Scanner;

import Section9.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        String name = sc.next();
        System.out.println("Digite o preço do Produto: ");
        double price = sc.nextDouble();

        Product produto = new Product(name, price);
        System.out.println("Dados do Produto: " + produto);

        System.out.println("Digite a nova quantidade de produtos a serem adicionados: ");
        produto.addProducts(sc.nextInt());
        System.out.println("Dados atualizados: " + produto);

        System.out.println("Digite a quantidade de produtos a serem removidas: ");
        produto.removeProducts(sc.nextInt());
        System.out.println("Dados atualizados: " + produto);
        sc.close();
    }
}
