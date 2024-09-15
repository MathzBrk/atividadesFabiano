package model;

public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private Boolean status;

    public Livro(String titulo, String autor, Integer numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.status = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void emprestar(){
        if(isDisponivel()){
            this.status = false;
            System.out.println("Livro Emprestado com sucesso");
        }else {
            System.out.println("Livro não Emprestado");
        }
    }

    public void devolverLivro(){
        if(!isDisponivel()){
            this.status = true;
            System.out.println("Livro Devolvido com sucesso");
        }else {
            System.out.println("Livro não estava emprestado");
        }
    }

    public boolean isDisponivel(){
        return status;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", status=" + status +
                '}';
    }
}
