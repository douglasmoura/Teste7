package teste;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        Livro l1 = new Livro("Harry Potter", 40.0, 50,"J. K. Rowling", "fantasia", 300 );
        Livro l2 = new Livro("Senhor dos Anéis", 60.0, 30,"J. R. R. Tolkien", "fantasia", 500 );
        Livro l3 = new Livro("Java POO", 20.0, 50,"GFT", "educativo", 500 );
        
        VideoGame ps4 = new VideoGame("PS4", 1800.0, 100,"Sony", "Slim", false );
        VideoGame ps4Usado = new VideoGame("PS4", 1000.0, 7,"Sony", "Slim", true );
        VideoGame xbox = new VideoGame("XBOX", 1500.0, 500,"Microsoft", "One", false );
        
        
        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
    
        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas","121345678", livros, games);

        System.out.println("Livro "+ l2.getTema()+" imposto R$:"+l2.calculaImposto()+" nome: "+ l2.getName()+".");
        System.out.println("Livro "+ l3.getTema()+" imposto R$:"+l3.calculaImposto()+" nome: "+ l3.getName()+".");
        System.out.println("Imposto "+ ps4Usado.getName()+" "+ps4Usado.getModelo()+"(usado: "+ps4Usado.getIsUsado()+") R$ "+ps4Usado.calculaImposto()+".");
        System.out.println("Imposto "+ ps4.getName()+" "+ps4.getModelo()+"(usado: "+ps4.getIsUsado()+") R$ "+ps4.calculaImposto()+".");

        americanas.listaVideoGames();
        americanas.listaLivros();

        System.out.println("O patrimonio da loja "+ americanas.getName()+" é de R$ "+ americanas.calculaPatrimonio());
    
    }
}
