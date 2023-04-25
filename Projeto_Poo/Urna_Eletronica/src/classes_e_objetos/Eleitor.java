package classes_e_objetos;

public class Eleitor  extends Pessoa{


    private String titulo;
    private boolean votou;

    public Eleitor(String nome) {
        super(nome);
        this.titulo=titulo;
        this.votou=false;
        //TODO Auto-generated constructor stub
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

   @Override
   public String getNome(){
    return super.getNome();
   } 
    @Override   
   public void setNome(String nome){
    super.setNome(nome);
   }

   @Override
   public boolean votou()
   {return this.votou;}

   @Override
   public boolean votar(){
    this.votou=true;
    return votou;
   }

   @Override

   public String getDados(){

    String dados = "Nome"+super.getDados()+ "\n" 
                    + "Titulo:"+this.getTitulo() +"\n";
            
      return dados;              
   }

}
