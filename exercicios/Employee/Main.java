package exercicios.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.Employee.entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        int n;
        do {
            System.out.print("Quantos funcionarios deseja cadastrar? ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.print("Digite um numero maior que 0!");
            }
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o id do funcionário: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do funcionário: ");
            String name = sc.nextLine();
            System.out.print("Digite o salário do funcionário: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.print("Qual Funcionário deseja dar um aumento? ");
        int idGrow = sc.nextInt();
        Employee employeeFilter = list.stream().filter(id -> id.getId() == idGrow).findFirst().orElse(null);
        if (employeeFilter != null) {
            System.out.print("Digite a porcentagem do aumento: ");
            double percentage = sc.nextDouble();
            employeeFilter.growSalary(percentage);
        } else {
            System.out.println("Esse funcionario não foi encontrado");
        }

        for (Employee employee : list) {
            System.out.println(employee);
        }
        sc.close();
    }

}
