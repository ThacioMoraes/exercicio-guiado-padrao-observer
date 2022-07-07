package br.com.digitalhouse.models;

import java.util.ArrayList;

public class Usuario implements Observavel{

  private String nome;
  private String sobrenome;
  private ArrayList<Observador> seguidores = new ArrayList<Observador>();
  private boolean subiuFoto = false;

  public Usuario(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  @Override
  public void adicionar(Observador seguidor) {
    seguidores.add(seguidor);
  }

  @Override
  public void remover(Observador seguidor) {
    seguidores.remove(seguidor);
  }

  @Override
  public void notificar() {
    for(Observador observador: this.seguidores){
      observador.atualizar(this.nome, this.sobrenome);
    }
  }

  public void subirFoto(){
    this.subiuFoto = true;
    notificar();
    this.subiuFoto = false;
  }
}
