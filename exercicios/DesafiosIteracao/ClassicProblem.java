public class ClassicProblem {
    public static void main(String[] args) {
        int[] sequencing = new int[10];
        sequencing[0] = 1;
        sequencing[1] = 1;

        for (int i = 2; i < sequencing.length; i++) {
            sequencing[i] = sequencing[i - 1] + sequencing[i - 2];
        }
        for (int i = 1; i < sequencing.length; i += 2) {
            System.out.println("Indice: " + i + " e seu valor: " + sequencing[i]);
        }
    }
}
