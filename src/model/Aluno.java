package model;

import service.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer matricula;
    private List<Double> notas;

    public Aluno(ArrayList<Double> notas, String nome) {
        this.notas = notas;
        this.nome = nome;
        this.matricula = GeradorId.getProximoId();
    }

    public double calcularMediaNotas(){
        double resultado = 0;

        for(Double nota : notas){
            resultado += nota;
        }
        return resultado / notas.size();
    }

    public void verificarSituacaoAluno(){
        Double mediaNotas = calcularMediaNotas();
        Double totalNota = 0.0;
        for(Double nota : notas){
            totalNota += nota;
        }

        if(totalNota >= 60 ){
            System.out.println("Aprovado! Com média de: " + mediaNotas);
        }else{
            System.out.println("Reprovado! Com média de: " + mediaNotas);
        }
    }
}
