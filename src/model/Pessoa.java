package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String profissao;

    public Pessoa(String nome, Integer idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String calcularIdadeEmAnoBissexto(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        return String.format("Ele tem %d anos, %d meses e %d dias de vida.", anos, meses, dias);
    }

    public void exibirPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissao: " + profissao);
    }
}
