package br.com.digitalhouse.models;

public interface Observavel {

  public void adicionar(Observador seguidor);
  public void remover(Observador seguidor);
  public void notificar();

}
