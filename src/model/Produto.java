package model;

import service.GeradorId;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Integer idProduto;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.idProduto = GeradorId.getProximoId();
    }

    public Integer getIdProduto() {
        return idProduto;
    }


    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public boolean verificarDisponibilidade() {
        if (quantidade >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularValorEmEstoque() {
        if (verificarDisponibilidade()) {
            return preco * quantidade;
        } else {
            return 0;
        }
    }


}
