package Section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // 1. Data local atual (apenas ano-mês-dia, sem horário)
        LocalDate d01 = LocalDate.now();

        // 2. Data e hora locais atuais do sistema (com frações de segundo, sem fuso
        // horário)
        LocalDateTime d02 = LocalDateTime.now();

        // 3. Data e hora globais atuais no padrão UTC / GMT (horário Zulu 'Z',
        // referência de Londres)
        Instant d03 = Instant.now();

        // 4. Converte texto no padrão ISO 8601 (ano-mês-dia) diretamente para LocalDate
        LocalDate d04 = LocalDate.parse("2008-01-28");

        // 5. Converte texto ISO 8601 com data e hora local (separados por 'T') para
        // LocalDateTime
        LocalDateTime d05 = LocalDateTime.parse("2008-01-28T20:30");

        // 6. Converte texto com fuso horário especificado (-03:00) e converte
        // automaticamente para UTC no Instant
        Instant d06 = Instant.parse("2008-01-28T20:30:00-03:00");

        // 7. Converte texto em formato customizado (ex: padrão brasileiro "dd/MM/yyyy")
        // usando um DateTimeFormatter
        LocalDate d07 = LocalDate.parse("28/01/2008", fmt1);
        // 8. Converte texto com data E hora no padrão customizado brasileiro
        // ("dd/MM/yyyy HH:mm") para LocalDateTime
        LocalDateTime d08 = LocalDateTime.parse("28/01/2008 01:30", fmt2);

        // 9. Instancia data diretamente a partir de valores isolados inteiros (ano, mês, dia)
        LocalDate d09 = LocalDate.of(2008, 1, 28);

        // 10. Instancia data e hora a partir de valores isolados (ano, mês, dia, hora, minuto)
        LocalDateTime d10 = LocalDateTime.of(2008, 1, 28, 1, 30);

        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);
        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07);
        System.out.println("D08: " + d08);
        System.out.println("D09: " + d09);
        System.out.println("D10: " + d10);
    }
}
