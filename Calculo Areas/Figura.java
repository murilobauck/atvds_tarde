public abstract class Figura {
  private String tipo;

  // Construtor padrão
  public Figura() {

  }

  // Construtor com parâmetro
  public Figura(String tipo) {
    this.tipo = tipo;
  }

  // Getters e Setters
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}