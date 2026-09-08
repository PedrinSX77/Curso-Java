package Section6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        if (x % 2 == 0){
            System.out.println("Número PAR");
        } else {
            System.out.println("Número IMPAR");
        }

        int y = sc.nextInt();
        sc.close();
        String dia;

        switch (y) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor Inválido";
                break;
        }
        System.out.println(dia);
        System.out.println(x % 2 == 0 ? "Número Par" : "Número Impar");
    }
}
