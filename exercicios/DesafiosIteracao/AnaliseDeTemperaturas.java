import java.util.Arrays;

public class AnaliseDeTemperaturas {
    public static void main(String[] args) {
        int[] temperaturas = {22, 25, 19, 30, 28, 24, 18};
        System.out.println(obtainMaxFor(temperaturas));
        System.out.println(obtainMaxForEach(temperaturas));
        System.out.println(obtainMaxStream(temperaturas));
    }

    public static int obtainMaxFor(int[] temps){
        int biggest = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > biggest){
                biggest = temps[i];
            }
        }
        return biggest;
    }

    public static int obtainMaxForEach(int[] temps){
        int biggest = temps[0];
        for (int temp : temps){
            if (temp > biggest) {
                biggest = temp;
            }
        }
        return biggest;
    }

    public static int obtainMaxStream(int[] temps){
        return Arrays.stream(temps).max().getAsInt();
    }
}
