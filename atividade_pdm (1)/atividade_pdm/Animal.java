public class Animal {

    private String nome;
    private String especie;
    private String habitat;
    private String descricao;
    private String imagem;

    public Animal(String nome, String especie,
                  String habitat, String descricao,
                  String imagem) {

        this.nome = nome;
        this.especie = especie;
        this.habitat = habitat;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }
}
