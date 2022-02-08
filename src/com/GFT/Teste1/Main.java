package src.com.GFT.Teste1;

import java.util.ArrayList;
import java.util.List;

public class Main {
  static List<Pessoa> pessoas = new ArrayList<Pessoa>();

  public static void main(String[] args) {
    pessoas.add(new Pessoa("João", 15));
    pessoas.add(new Pessoa("Leandro", 21));
    pessoas.add(new Pessoa("Paulo", 17));
    pessoas.add(new Pessoa("Jessica", 18));

    System.out.println("Mais velho: " + maisVelho(pessoas).getNome());
    System.out.println();
    System.out.println("Todos os nomes:");
    pessoas.stream().forEach(e -> System.out.println(e.getNome()));

    System.out.println();

    System.out.println("Antes da exclusão: " + pessoas.size());
    menos18(pessoas);

    System.out.println("Depois da exclusão: " + pessoas.size());
    System.out.println();

    System.out.println("Jessica esta presente ?");
    System.out.println(pessoas.stream().anyMatch(e -> e.getNome().equals("Jessica")));
  }

  public static Pessoa maisVelho(List<Pessoa> pessoas) {
    int maior = Integer.MIN_VALUE;
    int indiceMaior = -1;
    for (int i = 0; i < pessoas.size(); i++) {
      if (pessoas.get(i).getIdade() > maior) {
        maior = pessoas.get(i).getIdade();
        indiceMaior = i;
      }
    }
    return pessoas.get(indiceMaior);
  }

  public static List<Pessoa> menos18(List<Pessoa> pessoas)  {
      for(int i = 0; i < pessoas.size(); i++){
        if(pessoas.get(i).getIdade() < 18){
          pessoas.remove(i);
        }
      }
       return pessoas;
      }

  }

