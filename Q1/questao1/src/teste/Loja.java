package teste;

import java.util.List;

public class Loja {
    
    private String name;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja(String name, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.name = name;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public List<VideoGame> getVideoGames() {
        return videoGames;
    }
    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void  listaLivros(){

        for (int i = 0; i < livros.size(); i++) {
            
            if (getLivros().get(i) == null) {
                System.out.println("A loja não tem livros no seu estoque.");
            }else
            System.out.println("Título: "+getLivros().get(i).getName()+", preço "+ getLivros().get(i).getPrice()+", quantidade: "+ getLivros().get(i).getQtd());
        }
    }

    public void listaVideoGames(){

        for (int i = 0; i < videoGames.size(); i++) {
            
            if (getVideoGames().get(i) == null) {
                System.out.println("A loja não tem vídeo-games no seu estoque.");
            } else
            System.out.println("Video-game: "+ getVideoGames().get(i).getModelo()+", preço "+getVideoGames().get(i).getPrice()+", quantidade: "+ getVideoGames().get(i).getQtd());
        }
    }

    public Double calculaPatrimonio(){
        Double soma = 0.0;

        for (Livro livro : livros) {
            soma += livro.getPrice() * livro.getQtd();
        }

        for (VideoGame videoGame : videoGames) {
            soma += videoGame.getPrice() * videoGame.getQtd();
        }
        return soma;
    }
}
