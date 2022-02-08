package src.com.GFT.Teste2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    int maior, menor, media;
    boolean iguais;
    Scanner leitor = new Scanner(System.in);

    
    for(int i=0; i<5; i++){
      System.out.println("Digite um numero");
      numeros.add(leitor.nextInt());
      ;
    }
  
    maior = maiorNumero(numeros);
    menor = menorNumero(numeros);
    media = media(numeros);
    iguais = numerosIguas(numeros);


    System.out.println("Maior numero: " + maior);
    System.out.println("Menor numero: " + menor);
    System.out.println("Media dos numeros: " + media);
    System.out.println("São todos iguais: " + iguais);

    
    leitor.close();
  }

  public static int maiorNumero(List<Integer> x) {
    int maior = Integer.MIN_VALUE;
    int indiceMaior = -1;
    for (int i = 0; i < x.size(); i++) {
      if (x.get(i) > maior) {
        maior = x.get(i);
        indiceMaior = i;
      }
    }
    return x.get(indiceMaior);
}
  public static int menorNumero(List<Integer> x) {
    int menor = Integer.MAX_VALUE;
    int indiceMenor = -1;
    for (int i = 0; i < x.size(); i++) {
      if (x.get(i) < menor) {
        menor = x.get(i);
        indiceMenor = i;
      }
    }
    return x.get(indiceMenor);
}

  public static int media(List<Integer> x) {
    int soma = 0;
    int media;
    for (int n: x) {
      soma += n;
    }
    media = soma/x.size();
    return media;
}

public static Boolean numerosIguas(List<Integer> x) {
  Set<Integer> numerosSet = new HashSet<Integer>(x);
  return numerosSet.size() == 1;
}

}
