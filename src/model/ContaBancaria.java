package model;

public class ContaBancaria {
    private Integer numeroConta;
    private String titular;
    private Double saldo;

    public ContaBancaria(String titular, Integer numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + this.saldo);
        }else{
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: " + this.saldo);
        }
    }


}
