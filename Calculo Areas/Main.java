import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int escolha;
    // Menu para definir qual figura o usuário quer calcular a área
      do {
        System.out.println(" 1- Calcular área de um triângulo\n 2- Calcular área de um quadrado\n 3- Sair");
        System.out.print("Escolha uma opção: ");
        escolha = scanner.nextInt();
        switch (escolha) {
          case 1:
            
            break;
          case 2:
            
            break;
          case 3:
            System.out.println("Saindo...");
            break;
          default:
            System.out.println("Opção inválida");
            break;
        
        }
        } while (escolha != 3);

  }
}
