package model;

public class Produto {
  
  private final int codigo;
  private String nome;
  private double preco;
  private int estoque;
  
  public Produto() {
    this.codigo = 0;
  }
  
  public Produto(int codigo, String nome, double preco, int estoque) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;	
  }
  
  public int getCodigo() { return codigo; }
  public String getNome() { return nome; }
  public double getPreco() { return preco; }
  public int getEstoque() { return estoque; }
  
  public boolean setPreco(double preco) {
    if (preco < 0) { return false; }
    this.preco = preco;
    return true;
  }
  
  public void exibirInfo() {
    System.out.printf("Codigo: %d \nNome: %s \nPreco: R$%.2f \nEstoque: %d \n", codigo, nome, preco, estoque);
  }
  
}