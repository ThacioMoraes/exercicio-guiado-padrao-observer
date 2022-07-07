package br.com.digitalhouse.models;

public class Seguidor implements Observador{

  private String nome;
  private String sobrenome;
  private int contadorNotificacao = 0;

  public Seguidor(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  @Override
  public void atualizar(String nomeUsuario, String sobrenomeUsuario) {
    System.out.println( this.nome + " " + this.sobrenome + ", "
        + nomeUsuario + " " + sobrenomeUsuario + " subiu uma nova foto em sua timeline!");
    this.contadorNotificacao+= 1;
  }

  public int getContadorNotificacao() {
    return contadorNotificacao;
  }
}
