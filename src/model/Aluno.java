package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer matricula;
    private List<Double> notas;

    public Aluno(ArrayList<Double> notas, String nome, Integer matricula) {
        this.notas = notas;
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularMediaNotas(){
        double resultado = 0;

        for(Double nota : notas){
            resultado += nota;
        }
        return resultado / notas.size();
    }

    public void verificarSituacaoAluno(){
        Double nota = calcularMediaNotas();

        if(nota >= 60 ){
            System.out.println("Aprovado! Com médaia de: " + nota);
        }else{
            System.out.println("Reprovado! Com média de: " + nota);
        }
    }
}
