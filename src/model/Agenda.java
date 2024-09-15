package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContatoPorNumero(Integer numero) {
        Contato contato = buscarContatoPorNumero(numero);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato com o número " + numero + " removido.");
        } else {
            System.out.println("Contato com o número " + numero + " não encontrado.");
        }
    }

    public void removerContatoPorNome(String nome) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato com o nome " + nome + " removido.");
        } else {
            System.out.println("Contato com o nome " + nome + " não encontrado.");
        }
    }


    public void editarNumeroContato(Integer numero, String nome) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contato.setNumeroTelefone(numero);
        } else {
            System.out.println("Contato com o nome " + nome + " não encontrado.");
        }
    }

    public void editarNomeContato(String nome, Integer numero) {
        Contato contato = buscarContatoPorNumero(numero);
        if (contato != null) {
            contato.setNomeContato(nome);
        } else {
            System.out.println("Contato com o número " + numero + " não encontrado.");
        }
    }

    public void editarNomeContato(String nome, Contato contato) {
        contato.setNomeContato(nome);
    }

    public Contato buscarContatoPorNome(String nome) {
//        try {
//            for (Contato c : contatos) {
//                if (c.getNomeContato().equals(nome)) {
//                    return c;
//                }
//            }
//        }catch (Exception e) {
//            System.out.println("Erro ao buscar contato");
//        }
//        return null;
//    }

        Optional<Contato> contato = contatos.stream()
                .filter(c -> c.getNomeContato().equals(nome))
                .findFirst();

        return contato.orElse(null);
    }

    public Contato buscarContatoPorNumero(Integer numero) {
        Optional<Contato> contato = contatos.stream()
                .filter(c -> c.getNumeroTelefone().equals(numero))
                .findFirst();

        return contato.orElse(null);
    }
}
