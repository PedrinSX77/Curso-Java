package exercicios.Alturas;

import java.util.Locale;
import java.util.Scanner;

import exercicios.Alturas.entities.Person;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de entradas: ");
        int n;
        do {
            n = sc.nextInt();
            if (n <= 0) {
                System.err.println("Numero deve ser maior que 0");
            }
        } while (n <= 0);
        sc.nextLine();
        int under16 = 0;
        double sum = 0.0;
        Person[] persons = new Person[n];

        for (int i = 0; i < persons.length; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            persons[i] = new Person(nome, idade, altura);
            sc.nextLine();
        }

        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            sum += person.getHeight();
            if (person.getAge() < 16) {
                under16++;
            }
        }

        double percentage = (under16 * 100.0) / persons.length;
        double media = sum / persons.length;
        System.out.println("");
        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }

        sc.close();
    }
}