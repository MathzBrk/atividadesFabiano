package model;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private Integer idade;
    private List<Consulta> consultas = new ArrayList<Consulta>();

    public Paciente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void exibirConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }
}
