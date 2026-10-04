package model;

public class ContaCorrente {
  
  private int numero;
  private String titular;
  private float saldo;
  
  public ContaCorrente() {
    this.numero = 0;
    this.saldo = 0;
  }
  
  public ContaCorrente(int numero, String titular) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = 0;
  }
  
  public boolean sacar(float valor) {
    if (saldo < valor || valor > 10000) { return false; }
    saldo -= valor;
    return true;
  }
  
  public boolean depositar(float valor) {
    if (valor < 0 || valor > 10000) { return false; }
    saldo += valor;
    return true;
  }
  
  public float consultarSaldo() { return saldo; }
  
}