package model;

import service.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private int idLoja;
    private String nomeLoja;
    private String descricaoLoja;
    private List<Produto> produtos;

    public LojaVirtual(String nomeLoja, String descricaoLoja) {
        this.idLoja = GeradorId.getProximoId();
        this.nomeLoja = nomeLoja;
        this.descricaoLoja = descricaoLoja;
        this.produtos = new ArrayList<>();
    }

    public int getIdLoja() {
        return idLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public String getDescricaoLoja() {
        return descricaoLoja;
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void gerarCarrinhoDeCompras(List<Compra> compras, double percentualDesconto) {
        double valorTotalSemDesconto = 0;

        for (Compra compra : compras) {
            valorTotalSemDesconto += calcularValorTotalCompra(compra);
        }

        double valorTotalComDesconto = aplicarDesconto(valorTotalSemDesconto, percentualDesconto);

        // Exibindo o valor total e o valor com desconto
        System.out.println("Valor total da compra sem desconto: R$ " + valorTotalSemDesconto);
        System.out.println("Valor total da compra com desconto: R$ " + valorTotalComDesconto);

    }

    public double calcularValorTotalCompra(Compra compra){
        return compra.getProduto().getPreco() * compra.getQuantidade();
    }

    public double aplicarDesconto(double valorTotal, double percentual) {
        return valorTotal - (valorTotal * (percentual / 100));
    }
}
