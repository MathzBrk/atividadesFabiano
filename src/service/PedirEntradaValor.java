package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PedirEntradaValor implements IInputValor {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Integer solicitarEntradaInt(String mensagem) {
        Integer valor = null;
        while (valor == null) {
            try {
                System.out.println(mensagem);
                valor = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer de entrada inválida
            }
        }
        return valor;
    }

    @Override
    public String solicitarEntradaString(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    @Override
    public Double solicitarEntradaDouble(String mensagem) {
        Double valor = null;
        while (valor == null) {
            try {
                System.out.println(mensagem);
                valor = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine(); // Limpa o buffer de entrada inválida
            }
        }
        return valor;
    }
}
