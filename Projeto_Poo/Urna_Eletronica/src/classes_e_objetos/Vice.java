package classes_e_objetos;

public class Vice extends Pessoa {

    private String partido;

    public Vice(String nome,String partido) {
        super(nome);
        this.partido=partido;
        //TODO Auto-generated constructor stub
    }

    public String getPartido(){
        return partido;
    }

    @Override
    public void setNome(String nome){
        super.setNome(nome);
    }
    @Override

    public String getDados(){
        return super.getDados()+ "("+this.partido+")";


    }
    
    
}
