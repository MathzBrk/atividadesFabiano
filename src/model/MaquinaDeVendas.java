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

    public Produto selecionarProduto(String nomeProduto) {

        Optional<Produto> produtoSelecionado = produtos.stream()
                .filter(p -> p.getNome().toLowerCase().contains(nomeProduto.toLowerCase()))
                .findFirst();

        produtoSelecionado = produtoSelecionado.filter(Produto::verificarDisponibilidade);
        this.produtoSelecionado = produtoSelecionado.orElse(null);
        return this.produtoSelecionado;
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
            this.produtoSelecionado.setQuantidade(produtoSelecionado.getQuantidade() - 1);
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
