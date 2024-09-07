package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void adicionarAmigo(Usuario usuario, Usuario amigo) {
        if(usuarios.contains(usuario) && usuarios.contains(amigo)) {
            usuario.addAmigo(amigo);
            amigo.addAmigo(usuario);
            System.out.println("Amigo adicionado com sucesso!");
        }else{
            System.out.println("Usuario ou amigo não encontrado");
        }
    }

    public void publicarMensagem(String mensagem, Usuario usuario) {
        if(usuarios.contains(usuario)) {
            usuario.publicarMensagem(mensagem);
            System.out.println("Mensagem adicionado com sucesso!");
        }else {
            System.out.println("Mensagem não publicada");
        }
    }

    public void comentarEmPost(Usuario usuario, Integer idPost, String comentario) {
        Optional<Usuario> usuarioOptional = usuarios.stream()
                .filter(u -> u.getPosts().stream().anyMatch(p -> p.getId() == idPost))
                .findFirst();

        if (usuarioOptional.isPresent()) {
            Usuario donoDoPost = usuarioOptional.get();
            donoDoPost.comentarEmPost(idPost, comentario);
            System.out.println("Comentário publicado com sucesso.");
        } else {
            System.out.println("Post não encontrado.");
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) {
        Optional<Usuario> usuario = usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        return usuario.orElse(null);
    }




}
