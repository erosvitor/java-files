package com.ctseducare.files.xml.xmlencoder;

import java.io.Serializable;

public class Cliente implements Serializable {

  private static final long serialVersionUID = -511691548428415507L;

  private int codigo;
  private String nome;
  private char sexo;

  public Cliente() {
  }

  public Cliente(int codigo, String nome, char sexo) {
    this.codigo = codigo;
    this.nome = nome;
    this.sexo = sexo;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
}
