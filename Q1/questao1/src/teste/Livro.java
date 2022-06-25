package teste;

public class Livro extends Produto implements Imposto{

    private String autor;
    private String tema;
    private Integer qtdPag;
   
    public Livro(String nome, Double preco, Integer qtd, String autor, String tema, Integer qtdPag) {
        super(nome, preco, qtd);
        this.tema = tema;
        this.autor = autor;
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

    public Integer getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(Integer qtdPag) {
        this.qtdPag = qtdPag;
    }


    @Override
    public Double calculaImposto() {
        
        if (getTema().toLowerCase() == "educativo") {
            
            return 0.0;
        }

        return (getPrice() * 0.10);
    }


  

   
    
}
