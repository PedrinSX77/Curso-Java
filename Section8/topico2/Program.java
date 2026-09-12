package Section8.topico2;

import java.util.Locale;
import java.util.Scanner;

import Section8.topico2.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product produto = new Product();

        System.out.println("Digite o nome do Produto: ");
        produto.name = sc.next();
        System.out.println("Digite o preço do Produto: ");
        produto.price = sc.nextDouble();
        System.out.println("Digite a quantidade de estoque: ");
        produto.qtd = sc.nextInt();


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
