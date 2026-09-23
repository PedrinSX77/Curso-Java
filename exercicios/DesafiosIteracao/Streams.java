import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        double[] salaries = {1500.0, 3200.0, 1800.50, 4500.0, 1950.0, 5200.0};
        double result = Arrays.stream(salaries)
                            .filter(salary -> salary < 2000.0)
                            .map(salary -> salary * 1.1)
                            .sum();

        System.out.printf("Dinheiro a ser investido para aumento: R$ %.2f", result);
    }
}