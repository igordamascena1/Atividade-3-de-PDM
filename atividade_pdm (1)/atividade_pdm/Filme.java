public class Filme {

    private String titulo;
    private String genero;
    private int ano;
    private String descricao;
    private String imagem;

    public Filme(String titulo, String genero,
                 int ano, String descricao,
                 String imagem) {

        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }
}
