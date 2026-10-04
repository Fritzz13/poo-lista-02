import java.util.Scanner;
import model.ContaCorrente;

public class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    String titular;
    boolean inMenu = true;
    
    IO.print("Informe o numero da conta: ");
    numero = scanner.nextInt();
    scanner.nextLine();
    IO.print("Informe o nome do titular: ");
    titular = scanner.nextLine();
    ContaCorrente conta = new ContaCorrente(numero, titular);
    
    do {
      int acao;
      float valor;
      IO.print("Olá, " + titular + "! Informe a sua acao: \n 1- Sacar um valor \n 2- Depositar um valor \n 3- Consultar o saldo \n 4- Sair do programa \n\n> ");
      acao = scanner.nextInt();
      scanner.nextLine();
      
      
      switch(acao) {
        case 1:  // sacar
          IO.print("\n\nInforme o valor a sacar: R$");
          valor = scanner.nextFloat();
          scanner.nextLine();
          
          if (conta.sacar(valor)) { IO.println("Saque concluido com sucesso! \n"); }
          else { IO.println("O saque nao pode ser feito. Tente novamente. \n"); }
          break;
        
        case 2:  // depositar
          IO.print("\n\nInforme o valor a depositar: R$");
          valor = scanner.nextFloat();
          scanner.nextLine();
          
          if (conta.depositar(valor)) { IO.println("Deposito concluido com sucesso! \n"); }
          else { IO.println("O deposito nao pode ser feito. Tente novamente. \n"); }
          break;
        
        case 3:  // checar saldo
          System.out.printf("\n\nO seu saldo atual é de R$%.2f. \n\n", conta.consultarSaldo());
          break;
        
        case 4:  // fechar programa
          inMenu = false;
          break;
        
        default:
          IO.println("\n\nAcao invalida. Por favor, informe um numero entre 1 e 4. \n");
          break;
      }
    } while(inMenu);
    IO.println("\n\nObrigado por usar o programa! Volte sempre!! :DD \n");
  }
  
}