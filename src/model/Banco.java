package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeInstituição;
    private List<ContaBancaria> contas;
    private List<Cliente> clientes;

    public Banco(String nomeInstituição) {
        this.nomeInstituição = nomeInstituição;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void abrirConta(String titular, Integer numeroConta, Double saldo) {
        try {
            ContaBancaria contaBancaria = new ContaBancaria(titular, numeroConta, saldo);
            contas.add(contaBancaria);
            System.out.println("Conta aberta com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao abrir conta!");
        }
    }

    public void cadastrarCliente(String nome, String cpf) {
        try {
            Cliente cliente = new Cliente(nome, cpf);
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }
        catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente!");
        }
    }

    public ContaBancaria buscarConta(int numeroDaConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroDaConta) {
                return conta;
            }
        }
        return null;
    }

    // Método para realizar um saque
    public void sacar(int numeroDaConta, double valor) {
        ContaBancaria conta = buscarConta(numeroDaConta);
        if(conta != null) {
            conta.sacar(valor);
        }else {
            System.out.println("Conta nao encontrada!");
        }
    }

    // Método para realizar um depósito
    public void depositar(int numeroDaConta, double valor) {
        ContaBancaria conta = buscarConta(numeroDaConta);
        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito finalizado com sucesso!");
        }else{
            System.out.println("Conta nao encontrada!");
        }
    }




}
