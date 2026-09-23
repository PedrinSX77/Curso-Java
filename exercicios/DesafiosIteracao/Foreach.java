public class Foreach {
    public static void main(String[] args) {
        int count = 0;
        String[] linguagens = {"Java", "Python", "C", "JavaScript", "Ruby", "Go", "Rust"};
        for (String linguagem : linguagens){
            if (linguagem.length() > 4) {
                count++;
                System.out.println(linguagem);
            }
        }
        System.out.printf("Quantidades com mais de 4 Caracteres: %d",count);
    }
}
