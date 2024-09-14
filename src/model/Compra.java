package model;

public class Compra {
    private Produto produto;
    private int quantidade;

    @Override
    public String toString() {
        return "Compra{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }

    public Compra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
