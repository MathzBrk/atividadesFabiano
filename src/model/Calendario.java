package model;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class Calendario {
    private Set<LocalDate> feriados;

    public Calendario() {
        this.feriados = new HashSet<>();
        inicializarFeriados();
    }

    private void inicializarFeriados() {
        // Adiciona feriados ao conjunto
        feriados.add(LocalDate.of(2024, 1, 1));  // Confraternização Universal
        feriados.add(LocalDate.of(2024, 2, 12)); // Carnaval
        feriados.add(LocalDate.of(2024, 4, 21)); // Tiradentes
        feriados.add(LocalDate.of(2024, 5, 1));  // Dia do Trabalho
        feriados.add(LocalDate.of(2024, 6, 15)); // Corpus Christi
        feriados.add(LocalDate.of(2024, 9, 7));  // Independência do Brasil
        feriados.add(LocalDate.of(2024, 10, 12)); // Nossa Senhora Aparecida
        feriados.add(LocalDate.of(2024, 11, 2)); // Finados
        feriados.add(LocalDate.of(2024, 11, 15)); // Proclamação da República
        feriados.add(LocalDate.of(2024, 12, 25)); // Natal
        feriados.add(LocalDate.of(2023, 12, 31)); // Réveillon 2023
        feriados.add(LocalDate.of(2023, 12, 25)); // Natal 2023
        feriados.add(LocalDate.of(2023, 11, 2));  // Finados 2023
        feriados.add(LocalDate.of(2023, 9, 7));   // Independência do Brasil 2023
        feriados.add(LocalDate.of(2023, 8, 15));  // Assunção de Nossa Senhora
        feriados.add(LocalDate.of(2023, 6, 8));   // Corpus Christi 2023
        feriados.add(LocalDate.of(2023, 5, 1));   // Dia do Trabalho 2023
        feriados.add(LocalDate.of(2023, 4, 21));  // Tiradentes 2023
        feriados.add(LocalDate.of(2023, 2, 21));  // Carnaval 2023
        feriados.add(LocalDate.of(2023, 1, 1));   // Confraternização Universal 2023
    }

    public void exibirCalendarioDoMes(int mes, int ano) {
        LocalDate primeiroDiaDoMes = LocalDate.of(ano, mes, 1);
        DayOfWeek diaDaSemana = primeiroDiaDoMes.getDayOfWeek();
        int numeroDeDiasNoMes = primeiroDiaDoMes.lengthOfMonth();

        System.out.println("Calendário - " + primeiroDiaDoMes.getMonth() + " " + ano);
        System.out.println("Dom  Seg  Ter  Qua  Qui  Sex  Sab");

        // Espaços para o primeiro dia do mês
        for (int i = 0; i < diaDaSemana.getValue() - 1; i++) {
            System.out.print("     ");
        }

        // Exibir dias do mês
        for (int dia = 1; dia <= numeroDeDiasNoMes; dia++) {
            System.out.printf("%2d   ", dia);
            if ((dia + diaDaSemana.getValue() - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean verificarFeriado(LocalDate data) {
        return feriados.contains(data);
    }

    public long calcularDiferencaEmDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}
