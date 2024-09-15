package model;

import service.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;


    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void fazerEmprestimo(Livro livro) {

        try{
            if(livro.isDisponivel()){
                Emprestimo emprestimo = new Emprestimo(GeradorId.getProximoId(),"Livro emprestado: " + livro.getTitulo());
                this.emprestimos.add(emprestimo);
                this.livros.remove(livro);
                livro.setStatus(false);
                System.out.println("Emprestimo feito com sucesso");
            }else{
                System.out.println("Não foi possivel fazer o emprestimo;");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolverLivro();
        this.livros.add(livro);
    }

    public boolean verificarDisponibilidade(Livro livro) {
        return livros.contains(livro) && livro.isDisponivel();
    }

    public void listarLivros(){
        System.out.println("LIVROS DISPONÍVEIS: ");
        for(Livro livro : livros){
            System.out.println(livro);
        }
    }

}
