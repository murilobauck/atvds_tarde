import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;
    // Menu para o usuário definir qual figura deseja calcular a área
    do {
      System.out.println(" 1- Calcular área de um triângulo\n 2- Calcular área de um quadrado\n 0- Sair");
      System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
          case 1:
            calcularAreaQuadrado(scanner);
            break;
          case 2:
            calcularAreaTriangulo(scanner);
            break;
          case 0:
            System.out.println("Saindo do programa...");
            break;
          default:
            System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
  }
  
  // Pede ao usuário os dados necessários para calcular a área do quadrado
  // e cria um objeto da classe Quadrado
  private static void calcularAreaQuadrado(Scanner scanner) {
    System.out.print("Digite o lado do quadrado: ");
    double lado = scanner.nextDouble();
        
    // Criando objeto usando construtor
    Quadrado quadrado = new Quadrado(lado);
    System.out.println("Área do quadrado: " + quadrado.calcularArea());
  }

  // Pede ao usuário os dados necessários para calcular a área do triângulo
  // e cria um objeto da classe Triangulo
  private static void calcularAreaTriangulo(Scanner scanner) {
    System.out.print("Digite a base do triângulo: ");
    double base = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Digite a altura do triângulo: ");
    double altura = scanner.nextDouble();
        
    // Criando objeto usando construtor
    Triangulo triangulo = new Triangulo(base, altura);
    System.out.println("Área do triângulo: " + triangulo.calcularArea());
  }
}