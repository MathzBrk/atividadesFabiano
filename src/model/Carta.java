package model;

public class Carta {
    private String valor;
    private int valorNumerico;

    public Carta(String valor, int valorNumerico) {
        this.valor = valor;
        this.valorNumerico = valorNumerico;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor='" + valor + '\'' +
                ", valorNumerico=" + valorNumerico +
                '}';
    }

    public int getValorNumerico() {
        return valorNumerico;
    }
}
