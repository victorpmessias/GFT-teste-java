package src.com.GFT.Teste4;

import java.util.ArrayList;
import java.util.List;

import src.com.GFT.Teste4.models.Livro;
import src.com.GFT.Teste4.models.Loja;
import src.com.GFT.Teste4.models.VideoGame;

public class Main {
  Livro l1 = new Livro("Harry Potter", 50, 50, "J.K Rowling", "fantasia", 3000);
  Livro l2 = new Livro("Senhor dos anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
  Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);


  VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
  VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
  VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

  List<Livro> livros = new ArrayList<>();
  livros.add(l1);
  livros.add(l2);
  livros.add(l3);  
  
  
  List<VideoGame> videoGames = new ArrayList<>();
  videoGames.add(l1);
  videoGames.add(l2);
  videoGames.add(l3);

  Loja americanas = new Loja("Americanas", "123456789", livros, games);


  l2.calculaImposto();
  l3.calculaImposto();

  ps4Usado.calculaImposto();
  ps4Usado.calculaImposto();
  
  americanas.listaLivros();
  americanas.listaVideogames();
  americanas.calcularPatrimonio();
  
}
