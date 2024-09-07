package model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private static int contador = 0;
    private int id;
    private String mensagem;
    private List<String> comentarios;

    public Post(String mensagem) {
        this.id = ++contador;
        this.mensagem = mensagem;
        this.comentarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addComentario(String comentario) {
        comentarios.add(comentario);
    }
}

