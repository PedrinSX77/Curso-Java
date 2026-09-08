package exercicios;

public class Desafio01 {
    public static void main(String[] args) {
        int statusCode = 200;
        int tempoMs = 450;
        int horaInicio = 22;
        int horaFim = 2;
        int duracao;
        String status;

        if (statusCode == 200) {
            status = "ONLINE";
        } else {
            status = "OFFLINE";
        }

        System.out.println("O servidor está: " + status);
        if (tempoMs < 0) {
            System.out.println("Tempo inválido informado");
        } else if (tempoMs < 101) {
            System.out.println("Conexão Ultrarápida");
        } else if (tempoMs >= 101 && tempoMs <= 300) {
            System.out.println("Conexão normal");
        } else if (tempoMs >= 301 && tempoMs <= 800) {
            System.out.println("Alerta: Conexão Instável");
        } else if (tempoMs > 800) {
            System.out.println("Crítico: Conexão Degradada");
        } else {
            System.out.println("Tempo inválido informado");
        }

        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("O servidor ficou fora do ar por " + duracao + " hora(s)");
    }
}