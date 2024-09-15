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

    public Usuario buscarUsuarioPorId(Integer id) {
        Optional<Usuario> usuario = usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        return usuario.orElse(null);
    }

    public void listarUsuarios(){
        for(Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }





}
