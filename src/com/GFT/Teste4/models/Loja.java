package src.com.GFT.Teste4.models;

import java.util.ArrayList;
import java.util.List;

public class Loja {
  private String nome;
  private String cnpj;
  private List<Livro> livros = new ArrayList<Livro>();
  private List<VideoGame> videoGames = new ArrayList<VideoGame>();

  public Loja() {
  }

  public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.livros = livros;
    this.videoGames = videoGames;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public List<Livro> getLivros() {
    return livros;
  }

  public void setLivros(List<Livro> livros) {
    this.livros = livros;
  }

  public List<VideoGame> getVideoGame() {
    return videoGames;
  }

  public void setVideoGame(List<VideoGame> videoGame) {
    this.videoGames = videoGame;
  }

  public void listaLivros() {
    if (!livros.isEmpty()) {
      livros.stream().forEach(l -> System.out.println(l.getNome()));
      return;
    }
    System.out.println("A loja não tem livros em seu estoque.");
  }

  public void listaVideogames() {
    if (!videoGames.isEmpty()) {
      videoGames.stream().forEach(v -> System.out.println(v.getNome()));
      return;
    }
    System.out.println("A loja não tem video-games no seu estoque.");
  }

  public double calcularPatrimonio() {
    double soma = 0d;
    for (int i = 0; i <livros.size(); i++){
      soma +=(livros.get(i).getPreco()*livros.get(i).getQtd());
    }
    for (int i = 0; i <videoGames.size(); i++){
      soma +=(videoGames.get(i).getPreco()*videoGames.get(i).getQtd());
    }
    return soma;
  }
}
