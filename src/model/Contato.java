package model;

public class Contato {
    private Integer numeroTelefone;
    private String nomeContato;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Contato(Integer numeroTelefone, String nomeContato) {
        this.numeroTelefone = numeroTelefone;
        this.nomeContato = nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }


}
