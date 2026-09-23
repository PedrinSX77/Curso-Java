public class Array0 {
    public static void main(String[] argv) {
        int cont;
        int[] dados = new int[6];
        System.out.println("O número de elementos do array dados é: " + dados.length);
        for (cont = 0; cont < dados.length; cont++) {
            System.out.println("O elemento de índice " + cont + " vale " + dados[cont]);
        }
    }
}
