public class Media3 {
    public static void main(String[] args) {
        System.out.println("Cálculo da média de 4 notas.");
        calculaMedia();
    }

    public static void calculaMedia(){
        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            System.out.printf("A nota %d vale %.2f\n", (i + 1), notas[i]);
        }

        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        double media = soma/notas.length;

        System.out.printf("A média das notas é: %.2f\n", media);

    }
}

//Código aprimorado e mais aplicado
//public class Media3 {
//    public static void main(String[] args) {
//        double[] notas = new double[4];
//        for (int i = 0; i < notas.length; i++) {
//            notas[i] = Math.random() * 10;
//            System.out.printf("A nota %d vale %.2f\n", (i + 1), notas[i]);
//        }
//        System.out.printf("A média das notas é: %.2f\n", calculaMedia(notas));
//    }
//
//    public static Double calculaMedia(double[] notas){
//        double soma = 0;
//        for (double nota : notas){
//            soma += nota;
//        }
//        double media = soma/notas.length;
//        return media;
//    }
//}