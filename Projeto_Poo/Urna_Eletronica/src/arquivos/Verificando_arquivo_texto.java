
// @author: Marcio
package arquivos;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class Verificando_arquivo_texto extends Arquivo {
    
    // método para verificar a existência de um arquivo de candidatos
    public static boolean checandoArquivoCandidato(String nomearquivo)
    {

        boolean valido=false;
        
        // criação do objeto File apontando para o arquivo de candidatos especificado pelo nome
        File arquivo=new File(""+new File("").getAbsoluteFile()+"/home/marciohenrique/UFS/Programacao Orientada Objetos/Projeto_Poo/Urna_Eletronica/Arquivos/Candidatos/"
        +nomearquivo+".txt");
        
        // verificação se o arquivo existe
        valido=arquivo.exists();

        // retorna true caso o arquivo exista e false caso contrário
        return valido;

    }


  /**
 * Verifica se o arquivo de nome 'nomearquivo' existe na pasta de eleitores da Urna Eletrônica.
 * @param nomearquivo O nome do arquivo a ser verificado.
 * @return true se o arquivo existe e false caso contrário.
 */
public static boolean checandoarquivoeleitor(String nomearquivo) {
    boolean valido = false;
    File arquivo = new File("" + new File("").getAbsoluteFile() + "/home/marciohenrique/UFS/Programacao Orientada Objetos/Projeto_Poo/Urna_Eletronica/Arquivos/Eleitores/" + nomearquivo + ".txt");
    valido = arquivo.exists();
    return valido;
    }    



    public static boolean checandoarquivoeleicao( String arquivoeleicao)
    {

        boolean valido =false; // Inicializa a variável como "inválido"
    // Cria um objeto File para o arquivo de eleição especificado
        File arquivo=new File(""+new File("").getAbsoluteFile()+"/home/marciohenrique/UFS/Programacao Orientada Objetos/Projeto_Poo/Urna_Eletronica/Arquivos/Eleicao/"
        +arquivoeleicao+".txt");
      // Verifica se o arquivo existe
    if (arquivo.exists()) {
         // Lê o arquivo usando um BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha = br.readLine();
    // Inicializa várias variáveis de controle
            boolean abrindo_Fechando_Eleicao = false;
            boolean abrindo_Fechando_Cargos = false;
            boolean abrindo_Fechando_Titulo = false;
            boolean abrindo_Fechando_Vice = false;
            boolean abrindo_Fechando_Digitos = false;
            boolean abrindo_Fechando_Eleitos = false;
            boolean abrindo_Cargo = false;
            boolean fechando_Cargos = true;
            // Loop enquanto houver linhas no arquivo

            while (linha != null) {
                // Se a linha contém uma tag de eleição válida e não está abrindo/fechando eleições
                if (checando_linha_eleicao(linha) && !abrindo_Fechando_Eleicao) {
                    abrindo_Fechando_Eleicao = true;
                    fechando_Cargos = true;
                    // Se a linha contém uma tag de abertura de cargos
                } else if (linha.contains(Abre_cargos)) {
                    // Se já estiver abrindo um cargo ou se os cargos ainda não foram fechados
                    if (abrindo_Cargo || !fechando_Cargos) {
                        valido = false;
                        break;
                    } else {
                        abrindo_Fechando_Cargos = true;
                        fechando_Cargos = false;
                    }
                } else if (linha.contains(Abre_titulo) && !abrindo_Fechando_Titulo) {
                    abrindo_Fechando_Titulo = true;
                } else if (linha.contains(Abre_vice) && !abrindo_Fechando_Vice) {
                    abrindo_Fechando_Vice = true;
                } else if (linha.contains(Abre_digitos) && !abrindo_Fechando_Digitos) {
                    abrindo_Fechando_Digitos = true;
                } else if (linha.contains(Abre_eleitos) && !abrindo_Fechando_Eleitos) {
                    abrindo_Fechando_Eleitos = true;
                } else if (linha.contains(fecha_cargos)) {
                    if (abrindo_Cargo && abrindo_Fechando_Titulo && abrindo_Fechando_Vice && abrindo_Fechando_Digitos && abrindo_Fechando_Eleitos) {
                        abrindo_Cargo = false;
                    } else if (!fechando_Cargos) {
                        valido = false;
                        break;
                    } else {
                        abrindo_Fechando_Cargos = false;
                        fechando_Cargos = true;
                    }
                }

                linha = br.readLine();
            }

            valido = abrindo_Fechando_Eleicao && fechando_Cargos && !abrindo_Fechando_Cargos;
        } catch (IOException ex) {
            System.err.println(ex);
            valido = false;
        }
    } else {
        System.err.println("Arquivo não encontrado");
    }

    return valido;
}



private static boolean checando_linha_eleicao(String linha) {
    boolean valido = false;
    String nomePresente = "";
    int inicio = 0;
    int fim = 0;

    if (linha.contains(Abre_eleicao) && linha.contains(fecha_eleicao)) {
        inicio = linha.indexOf(Abre_eleicao);
        fim = linha.indexOf(fecha_eleicao);
        nomePresente = linha.substring(inicio, fim);

        if (!nomePresente.equals("")) {
            valido = true;
        }
    }

    return valido;

}

}
