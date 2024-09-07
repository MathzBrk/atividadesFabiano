package model;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private Integer numeroAleatorio;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public JogoAdivinhacao() {
        this.numeroAleatorio = random.nextInt(100);
    }

    public void darPalpite(){
        int numeroPalpitado;

        do {
            System.out.println("Digite um palpite para o número aleatório: ");
            numeroPalpitado = scanner.nextInt();
            if (numeroPalpitado > numeroAleatorio) {
                System.out.println("O numero aleatório é menor! Digite outra vez");
            } else if (numeroPalpitado < numeroAleatorio) {
                System.out.println("O numero aleatório é maior! Digite outra vez");
            } else {
                System.out.println("Você Acertou!!!");
            }
        } while (numeroPalpitado != numeroAleatorio);

    }

}
