package model;

public class Carro {
    private String marca;
    private String modelo;
    private Integer velocidade;

    public Carro(String marca, String modelo, Integer velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        this.velocidade += 5;
    }

    public void frear(){
        this.velocidade -= 5;
    }

    public void exibirVelocidade(){
        System.out.println("A velocidade atual é: " + this.velocidade);
    }
}
