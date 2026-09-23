public class ArrayDiasMes {
    public static void main(String[] args) {
        System.out.println("O número de dias de cada mês do ano é:");
        diaMes();
    }

    public static void diaMes(){
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < months.length; i++){
            int month = i + 1;
            System.out.println("O mês " + month + " possui " + months[i] + " dias.");
        }
    }
}