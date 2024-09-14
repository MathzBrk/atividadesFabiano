package service;


public interface IInputValor {
    Integer solicitarEntradaInt(String mensagem);
    String solicitarEntradaString(String mensagem);
    Double solicitarEntradaDouble(String mensagem);
}
