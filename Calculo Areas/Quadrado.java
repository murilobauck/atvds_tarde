public class Quadrado extends Figura {
  // Declaração de variáveis
  private double lado;

  // Construtor padrão
  public Quadrado() {

  }

  // Construtor com parâmetro
  public Quadrado(double lado) {
    super("Quadrado");
    this.lado = lado;
  }

  // Método para calcular área
  public double calcularArea() {
    return lado * lado;
  }

  // Getters e Setters
  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }
}