package dto;

public class LivroDTO {
    int id;
    String nome;
    String genero;
    public LivroDTO(int id, String nome, String genero){
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}