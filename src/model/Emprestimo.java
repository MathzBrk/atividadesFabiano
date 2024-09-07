package model;

public class Emprestimo {
    private Integer id;
    private String descricao;

    public Emprestimo(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
