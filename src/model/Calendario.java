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

        feriados.add(LocalDate.of(2024, 1, 1));
        feriados.add(LocalDate.of(2024, 12, 25));

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
