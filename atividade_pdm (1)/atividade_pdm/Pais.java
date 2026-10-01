public class Pais {

    private String nome;
    private String capital;
    private String continente;
    private String imagem;

    public Pais(String nome, String capital,
                String continente, String imagem) {
        this.nome = nome;
        this.capital = capital;
        this.continente = continente;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinente() {
        return continente;
    }

    public String getImagem() {
        return imagem;
    }
}
