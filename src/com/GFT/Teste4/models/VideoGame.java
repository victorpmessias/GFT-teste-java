package src.com.GFT.Teste4.models;

public class VideoGame extends Produto{
  String marca;
  String modelo;
  boolean isUsado;
  public VideoGame() {
  }



  public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
    super(nome, preco, qtd);
    this.marca = marca;
    this.modelo = modelo;
    this.isUsado = isUsado;
  }



  public String getMarca() {
    return marca;
  }



  public void setMarca(String marca) {
    this.marca = marca;
  }



  public String getModelo() {
    return modelo;
  }



  public void setModelo(String modelo) {
    this.modelo = modelo;
  }



  public boolean isUsado() {
    return isUsado;
  }



  public void setUsado(boolean isUsado) {
    this.isUsado = isUsado;
  }



  @Override
  public double calculaImposto() {
    if(this.isUsado()){
      return (this.getPreco() +(25 * (this.getPreco()/100)));
    }else{
      return (this.getPreco() +(45 * (this.getPreco()/100)));
    }
  }
  
}
