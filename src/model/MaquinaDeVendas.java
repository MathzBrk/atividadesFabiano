package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaquinaDeVendas {
    private List<Produto> produtos;
    private Double dinheiroCliente;
    private Produto produtoSelecionado;

    public MaquinaDeVendas() {
        this.produtos = new ArrayList<Produto>();
        this.dinheiroCliente = 0.0;
        this.produtoSelecionado = null;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public Produto selecionarProduto(Produto produto) {
        this.produtoSelecionado = produto;

        Optional<Produto> produtoC = produtos.stream()
                .filter(p -> p.getIdProduto() == this.produtoSelecionado.getIdProduto() && p.verificarDisponibilidade())
                .findFirst();

        return produtoC.orElse(null);
    }

    public void inserirDinheiroCliente(Double dinheiroCliente) {
        this.dinheiroCliente += dinheiroCliente;
    }

    public double retornarTroco(){
        if (this.produtoSelecionado == null) {
            throw new IllegalStateException("Nenhum produto foi selecionado.");
        }

        double valorProduto = produtoSelecionado.getPreco();
        if (dinheiroCliente >= valorProduto) {
            double troco = dinheiroCliente - valorProduto;
            dinheiroCliente = 0.0;
            this.produtoSelecionado = null;
            return troco;
        } else {
            throw new IllegalArgumentException("Dinheiro insuficiente para comprar o produto.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque disponível:");
        for (Produto produto : produtos) {
            if (produto.verificarDisponibilidade()) {
                System.out.println("ID: " + produto.getIdProduto() + ", Nome: " + produto.getNome() +
                        ", Preço: R$ " + produto.getPreco());
            }
        }
    }

}
