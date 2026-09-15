package Section10.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Joana");
        list.add(2, "Marco");
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("---------------------");

        System.out.println(list.size());
        // list.remove(1); Pode se comparar o valor do elemento ex.: "Maria"
        // list.removeIf(x -> x.charAt(0) == 'M'); // Remoção por predicado que retorna
        // verdadeiro ou falso

        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("---------------------");
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Retorna -1 pois marco foi removido da Lista

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for (String string : result) {
            System.out.println(string);
        }
    }
}
