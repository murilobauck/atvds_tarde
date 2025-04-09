public class Triangulo extends Figura {
  // Declaração de váriaveis
  private double base;
  private double altura;

  // Construtor padrão
  public Triangulo() {

  }

  // Construtor com parâmetros
  public Triangulo(double base, double altura) {
    super("Triângulo");
    this.base = base;
    this.altura = altura;
  }

  // Método para calcular área
  public double calcularArea() {
    return (base * altura) / 2;
  }

  // Getters e Setters
  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}