package Section12.Composition.application;

import Section12.Composition.entities.Department;
import Section12.Composition.entities.HourContract;
import Section12.Composition.entities.Worker;
import Section12.Composition.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter Worker Data");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevelStr = sc.nextLine();
        WorkerLevel workerLevel = WorkerLevel.valueOf(workerLevelStr);
        System.out.print("Base Salary: ");
        double workerBaseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, department);

        do {
            System.out.print("How many contracts to this worker? ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String dateStr = sc.next();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            DateTimeFormatter dateDayMonthYear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dateStr, dateDayMonthYear);

            HourContract contract = new HourContract(date, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.next(); // Pega o input do usuário

        DateTimeFormatter dateMonthYear = DateTimeFormatter.ofPattern("MM/yyyy"); // Define o contrato do Pattern a ser usado
        YearMonth ym = YearMonth.parse(monthYear, dateMonthYear); // Converte a String no padrão Mês/Ano com YearMonth

        int month = ym.getMonthValue(); // Pega o valor do mês
        int year = ym.getYear(); // Pega o valor do ano

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}