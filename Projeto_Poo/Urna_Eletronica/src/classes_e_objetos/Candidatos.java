package classes_e_objetos;
import Interface.Votacao_do_candidato;


public class Candidatos {
    
    private int numero;
    private String partido;
    private int votos;
    private String cargo;
    private Eleitor eleitor;
    private Vice Vice vice;


    public Candidatos(String nome,String titulo,String cargo, int numero,String partido, int votos){

        this.eleitor= new Eleitor(nome,titulo);
        this.cargo=cargo;
        this.numero=numero;
        this.partido=partido;
        this.votos=votos;
    }

    public Candidatos(String nome,String titulo,String cargo, int numero,String partido, int votos,String partidovice,String vice)
    {

        this(nome, titulo, cargo, numero, partidovice, votos);
    }   this.vice= new Vice(vice,partidovice);


    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }

    public void getPartido(){
        return partido;
    }
    public void setPartido(String partido){

        this.partido=partido;
    }


    public void getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){

        this.partido=cargo;
    }

    public Vice getVice(){

        Vice vice=null;
        if(this.temvice())
            vice=this.vice;
        return vice;
    }

    private boolean temvice() {
        return false;
    }

    public Eleitor getEleitor(){

        return eleitor;
    }


}
