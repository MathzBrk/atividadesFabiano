package model;

public class Triangulo {
    private Double lado1, lado2, lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Double getLado1() {
        return lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public boolean isTrianguloValido() {
        boolean condicao1 = lado1 + lado2 > lado3;
        boolean condicao2 = lado1 + lado3 > lado2;
        boolean condicao3 = lado2 + lado3 > lado1;

        return condicao1 && condicao2 && condicao3;
    }

    public double calculaArea() {
        if(isTrianguloValido()){
            return lado1 * lado2 * lado3;
        }else{
            return 0;
        }
    }

}