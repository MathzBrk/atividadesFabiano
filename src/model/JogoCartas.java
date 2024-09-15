package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    private List<Carta> baralho;
    private List<List<Carta>> maoJogadores;
    private Integer numeroJogadores;
    private List<String> jogadores;

    public List<Carta> getBaralho() {
        return baralho;
    }

    public List<Carta> getMaoJogador(int jogadorIndex) {
        return maoJogadores.get(jogadorIndex);
    }

    public String getNomeJogador(int jogadorIndex) {
        return jogadores.get(jogadorIndex);
    }

    public List<String> getJogadores() {
        return jogadores;
    }

    public JogoCartas(Integer numeroJogadores){
        this.numeroJogadores = numeroJogadores;
        this.jogadores = new ArrayList<>();
        this.maoJogadores = new ArrayList<>();
        inicializarBaralho();
        embaralharBaralho();
        distribuirCartas();
    }

    private void inicializarBaralho(){
        baralho = new ArrayList<>();

        String[] valores = {"4", "5", "6", "7", "Q", "J", "K", "A"};
        int[] valoresNumericos = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < valores.length; i++) {
            baralho.add(new Carta(valores[i], valoresNumericos[i]));
            baralho.add(new Carta(valores[i], valoresNumericos[i]));
            baralho.add(new Carta(valores[i], valoresNumericos[i]));
            baralho.add(new Carta(valores[i], valoresNumericos[i]));
        }
    }

    private void embaralharBaralho() {
        Collections.shuffle(baralho);
    }

    private void distribuirCartas(){
        for (int i = 0; i < numeroJogadores; i++) {
            maoJogadores.add(new ArrayList<>());
        }

        int cartasPorJogador = 3;
        for (int i = 0; i < cartasPorJogador; i++) {
            for (int j = 0; j < numeroJogadores; j++) {
                maoJogadores.get(j).add(baralho.remove(0));
            }
        }
    }

    public void adicionarJogador(String nome) {
        jogadores.add(nome);
        maoJogadores.add(new ArrayList<>());
    }

    public void exibirMaoJogadores() {
        for (int i = 0; i < numeroJogadores; i++) {
            System.out.println("Jogador " + (i + 1) + " (" + jogadores.get(i) + "): " + maoJogadores.get(i));
        }
    }

    public boolean jogarCarta(int jogadorIndex, int cartaIndex) {
        if (jogadorIndex >= 0 && jogadorIndex < numeroJogadores) {
            List<Carta> mao = maoJogadores.get(jogadorIndex);
            if (cartaIndex >= 0 && cartaIndex < mao.size()) {
                Carta cartaJogada = mao.remove(cartaIndex);
                System.out.println("Jogador " + (jogadorIndex + 1) + " jogou a carta: " + cartaJogada);
                return true;
            }
        }
        return false;
    }

}
