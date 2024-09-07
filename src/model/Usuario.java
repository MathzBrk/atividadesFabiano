package model;

import Control.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private Integer id;
    private List<Post> posts;
    private List<Usuario> amigos;

    public Usuario(String nome, Integer id) {
        this.nome = nome;
        this.id = GeradorId.getProximoId();
        this.posts = new ArrayList<Post>();
        this.amigos = new ArrayList<>();
    }

    public void addAmigo(Usuario amigo) {
        if (!amigos.contains(amigo)) {
            amigos.add(amigo);
        }
    }

    public void publicarMensagem(String mensagem) {
        posts.add(new Post(mensagem));
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void comentarEmPost(int postId, String comentario) {

        Post post = posts.stream()
                        .filter(p -> p.getId() == postId)
                                .findFirst()
                                        .orElse(null);

        if(post != null) {
            post.addComentario(comentario);
            System.out.println("Comentario adicionado com sucesso");
        }else{
            System.out.println("Post não encontrado.");
        }
    }
}
