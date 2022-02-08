package src.com.GFT.Teste4.models;

public class Livro extends Produto{
  String autor;
  String tema;
  int qtdPag;
  public Livro() {
  }



  public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
    super(nome, preco, qtd);
    this.autor = autor;
    this.tema = tema;
    this.qtdPag = qtdPag;
  }



  public String getAutor() {
    return autor;
  }



  public void setAutor(String autor) {
    this.autor = autor;
  }



  public String getTema() {
    return tema;
  }



  public void setTema(String tema) {
    this.tema = tema;
  }



  public int getQtdPag() {
    return qtdPag;
  }



  public void setQtdPag(int qtdPag) {
    this.qtdPag = qtdPag;
  }



  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((autor == null) ? 0 : autor.hashCode());
    result = prime * result + qtdPag;
    result = prime * result + ((tema == null) ? 0 : tema.hashCode());
    return result;
  }



  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Livro other = (Livro) obj;
    if (autor == null) {
      if (other.autor != null)
        return false;
    } else if (!autor.equals(other.autor))
      return false;
    if (qtdPag != other.qtdPag)
      return false;
    if (tema == null) {
      if (other.tema != null)
        return false;
    } else if (!tema.equals(other.tema))
      return false;
    return true;
  }



  @Override
  public double calculaImposto() {
    if(this.getTema().equalsIgnoreCase("Educativo")){
      return 0d;
    }else{
      return (this.getPreco() +(10 * (this.getPreco()/100)));
    }
  }
  
}
