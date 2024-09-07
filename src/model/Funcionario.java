package model;

public class Funcionario {
    private String nome;
    private String cargo;
    private Double salario;

    public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularDescontoINSS(){
        double descontoINSS = 0.0;

        if (salario <= 1320.00) {
            descontoINSS = salario * 0.075;
        } else if (salario <= 2571.29) {
            descontoINSS = salario * 0.09;
        } else if (salario <= 3856.94) {
            descontoINSS = salario * 0.12;
        } else {
            descontoINSS = salario * 0.14;
        }
        return descontoINSS;
    }

    public double calcularDescontoIRPF(){
        double descontoIRPF = 0.0;
        if (salario <= 1903.98) {
            descontoIRPF = 0.0;
        } else if (salario <= 2826.65) {
            descontoIRPF = (salario * 0.075) - 142.80;
        } else if (salario <= 3751.05) {
            descontoIRPF = (salario * 0.15) - 354.80;
        } else if (salario <= 4664.68) {
            descontoIRPF = (salario * 0.225) - 636.13;
        } else {
            descontoIRPF = (salario * 0.275) - 869.36;
        }

        return descontoIRPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public double calcularSalarioLiquido(double beneficios) {
        double descontos = calcularDescontoIRPF() + calcularDescontoINSS();
        return this.salario - descontos + beneficios;
    }
}
