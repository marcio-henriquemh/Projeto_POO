package classes_e_objetos;
/**
 * 
 * 
 *  @author Marcio
 */
public class Pessoa {

    private String nome;

// Construtor que recebe o nome da Pessoa
public Pessoa(String nome) {
    this.nome = nome;
}

// Getter para o atributo nome
public String getNome() {
    return this.nome;
}

// Setter para o atributo nome
public void setNome(String nome) {
    this.nome = nome;
}

// Retorna uma String com os dados da Pessoa
public String getDados() {
    return this.nome;
}

}
