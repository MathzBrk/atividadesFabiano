package model;

import service.GeradorId;

public class Consulta {
    private int idConsulta;
    private String titulo;
    private String descricao;
    private Paciente paciente;

    public Consulta(String titulo, String descricao, Paciente paciente) {
        this.idConsulta = GeradorId.getProximoId();
        this.titulo = titulo;
        this.descricao = descricao;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsulta=" + idConsulta +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", paciente=" + paciente.getNome() +
                '}';
    }
}
