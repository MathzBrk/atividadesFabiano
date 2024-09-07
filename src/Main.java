import model.Aluno;
import model.Circulo;
import model.ContaBancaria;
import model.JogoAdivinhacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
   Circulo circulo = new Circulo(5);

   System.out.println("O valor da area é: " + circulo.calcularArea());
   System.out.println("O valor do perimetro é: " + circulo.calcularPerimetro());


   ArrayList<Double> notas = new ArrayList<>();
   notas.add(13.2);
   notas.add(20.0);
   notas.add(15.0);
   notas.add(29.0);

   Aluno aluno = new Aluno(notas, "Matheus", 232);
   aluno.verificarSituacaoAluno();

   JogoAdivinhacao jogo = new JogoAdivinhacao();
   jogo.darPalpite();

    }
}