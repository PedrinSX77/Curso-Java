public class Array2 {
    public static void main(String[] args) {
        int[] dados1 = {1, 4, 9, 16, 25, 36};
        int[] dados2 = new int[6];

        for (int i = 0; i < dados1.length; i++) {
            dados2[i] = (int) Math.sqrt(dados1[i]);
            System.out.println("A raiz quadrada de " + dados1[i] + " é " + dados2[i]);
        }
    }
}
