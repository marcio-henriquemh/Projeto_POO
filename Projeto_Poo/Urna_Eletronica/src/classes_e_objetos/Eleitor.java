package classes_e_objetos;

public class Eleitor extends Pessoa {
    
    private String titulo; // Título de eleitor do eleitor.
    private boolean votou; // Indica se o eleitor já votou ou não.
    
    /**
     * Construtor da classe Eleitor.
     * 
     * @param nome Nome do eleitor.
     * @param titulo Título de eleitor do eleitor.
     */
    public Eleitor(String nome, String titulo) {
        super(nome);
        this.titulo = titulo;
        this.votou = false;
    }
    
    /**
     * Retorna o título de eleitor do eleitor.
     * 
     * @return Título de eleitor do eleitor.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Altera o título de eleitor do eleitor.
     * 
     * @param titulo Novo título de eleitor do eleitor.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Verifica se o eleitor já votou.
     * 
     * @return true se o eleitor já votou, false caso contrário.
     */
    public boolean votou() {
        return votou;
    }
    
    /**
     * Altera o estado de votação do eleitor.
     * 
     * @param votou true se o eleitor já votou, false caso contrário.
     */
    public void setVotou(boolean votou) {
        this.votou = votou;
    }
    
    /**
     * Simula o ato de votação do eleitor.
     * 
     * @return true se o eleitor votou com sucesso, false caso contrário.
     */
    public boolean votar() {
        if (votou) {
            System.out.println("Eleitor " + super.getNome() + " já votou!");
            return false;
        } else {
            votou = true;
            System.out.println("Eleitor " + super.getNome() + " votou com sucesso!");
            return true;
        }
    }
    
    /**
     * Retorna os dados do eleitor em formato de string.
     * 
     * @return Dados do eleitor.
     */
    @Override
    public String getDados() {
        String dados = "Nome: " + super.getNome() + "\n"
                       + "Título de eleitor: " + this.getTitulo() + "\n";
        return dados;
    }
}    