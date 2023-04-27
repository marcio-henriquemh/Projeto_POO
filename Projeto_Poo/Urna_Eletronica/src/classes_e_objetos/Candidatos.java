package classes_e_objetos;
//import Interface.Votacao_do_candidato;
/**
 * @author Marcio
 */

public class Candidatos {
    //atributos
    private int numero;
    private String partido;
    private int votos;
    private String cargo;
    private Eleitor eleitor;
    private Vice vice;

    // Construtor sem vice
    public Candidatos(String nome, String titulo, String cargo, int numero, String partido, int votos) {
        this.eleitor = new Eleitor(nome, titulo);
        this.cargo = cargo;
        this.numero = numero;
        this.partido = partido;
        this.votos = votos;
    }

    // Construtor com vice
    public Candidatos(String nome, String titulo, String cargo, int numero, String partido, int votos, String partidovice, String nomeVice) {
        this(nome, titulo, cargo, numero, partido, votos);
        this.vice = new Vice(nomeVice, partidovice);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Vice getVice() {
        if (temVice()) {
            return vice;
        } else {
            return null;
        }
    }

    private boolean temVice() {
        return vice != null;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }
}
