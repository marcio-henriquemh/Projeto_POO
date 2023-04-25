/*
 *  Classe Abstrata contendo as constantes que seraão utilizadas para ler as tags de marcação
 * 
 * O Intuito é que informe ao programa em qual parte do arquivo está o cargo,titulo, vice do cargo candidato.
 * 
 *  A classe Arquivo contém os métodos e constantes que vão ser utilizadas para manipular o arquivo.
 * 
 * 
*  
 */

//importando os pacotes

/**
 * 
 * 
 * 
 *  @author Marcio
 */
package arquivos;

public abstract class Arquivo
{
    //Dados cargo do candidato
    public static final String Abre_eleicao="<eleicao>";
    public static final String fecha_eleicao="</eleicao>";
    public static final String Abre_cargos="<cargos>";
    public static final String fecha_cargos="</cargos>";
    public static final String Abre_titulo="<titulo>";
    public static final String fecha_titulo="</titulo>";
    public static final String Abre_vice="<vice>";
    public static final String fecha_vice="</vice>";
    public static final String Abre_digitos="<digitos>";
    public static final String fecha_digitos="</digitos>";
    public static final String Abre_votos="<votos>";
    public static final String fecha_votos="</votos>";
    public static final String Abre_eleitos="<eleitos>";
    public static final String fecha_eleitos="</eleitos>";
    

    //Dados de acesso mesario

    public static final String Abre_mesario="<mesario>";
    public static final String fecha_mesario="</meario>";
    public static final String Abre_login="<login>";
    public static final String fecha_login="</login>";
    public static final String Abre_senha="<senha>";
    public static final String fecha_senha="</senha>";
    

    //abre dados eleitor

    public static final String Abre_eleitor="<eleitor>";
    public static final String fecha_eleitor="</eleitor>";
    public static final String Abre_nome="<nome>";
    public static final String fecha_nome="</nome>";
    
    //numeros do parido

    public static final String Abre_numero="<numero>";
    public static final String fecha_numero="</numero>";
    public static final String Abre_partido="<partido>";
    public static final String fecha_partido="</partido>";
    public static final String Abre_partido_vice="<partidovice>";
    public static final String fecha_partido_vice="</partidovice>";
    public static final String Abre_politico="<politico>";
    public static final String fecha_politico="</politico>";
    


}
