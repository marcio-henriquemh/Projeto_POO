/*
 Interface de Login , onde será lido o arquivo de lendo arquivos.

 Na classe lendo arquivos será feita interface de login que fornee a assinatura









 */

/**
 * 
 *  @author Marcio 
 */

//importando da pasta Arquivo para ler os arquivos dos candidatos
package arquivos;
import Interface.Login_usuario;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.security.auth.spi.LoginModule;

import classes_e_objetos.Candidatos;
import classes_e_objetos.Eleitor;
import classes_e_objetos.Mesario;
import classes_e_objetos.Periodo_Eleitorial;
import classes_e_objetos.Validacao_Mesario;


public class Lendo_Arquivo extends Arquivo 
{
    
    public static ArrayList<Periodo_Eleitorial> leraquivoEleicao(String path){

        ArrayList<Periodo_Eleitorial> eleicoes= new ArrayList<>();
        Periodo_Eleitorial eleicao;
        String linha;
        File arquivo= new File(path);


        String nome="";
        String titulo="";
        boolean vice=false;
        int digitos=0;
        int eleitos=0;

        int inicio=0;
        int fim=0;

        if(arquivo.exists()){

                try{

                    BufferedReader br= new BufferedReader((new InputStreamReader(new FileInputStream(arquivo.getAbsolutePath()),"ISO-8859-1")));

                    if(br.ready()){

                        linha=br.readLine();
                        inicio=linha.indexOf(Abre_eleicao)+Abre_eleicao.length();
                        fim=linha.indexOf(fecha_eleicao);
                        nome=linha.substring(inicio, fim);
                        if (br.ready()) {
                            linha=br.readLine();
                            //// Loop para ler as informações dos cargos
                            while (br.ready() && !linha.contains(fecha_cargos))
                             {
                                linha=br.readLine();
                                // // Verifica se é um novo cargo
                                if (linha.contains(Abre_cargos)) {
                                    titulo="";
                                    vice=false;
                                    digitos=0;
                                }
                                //Lê o titulo do cargo
                                if (linha.contains(Abre_titulo) && linha.contains(fecha_titulo))
                                {
                                    
                                    inicio=linha.indexOf(Abre_titulo)+Abre_titulo.length();
                                    fim=linha.indexOf(fecha_titulo);
                                    titulo=linha.substring(inicio, fim);
                                }
                                //verificar se o cargo tem vice

                                if (linha.contains(Abre_vice) && linha.contains(fecha_vice)) {

                                    inicio=linha.indexOf(Abre_vice)+Abre_vice.length();
                                    fim=linha.indexOf(fecha_vice);

                                    String aux=linha.substring(inicio, fim);
                                    vice=aux.equalsIgnoreCase("sim");                     
                                }
                                //lẽ o digito para votação
                                if (linha.contains(Abre_digitos) && linha.contains(fecha_digitos)) {
                                    inicio=linha.indexOf(Abre_digitos)+Abre_digitos.length();
                                    fim=linha.indexOf(fecha_digitos);
                                    digitos=Integer.parseInt(linha.substring(inicio, fim));
                                }

                                //numero de eleitos para o cargo
                                if (linha.contains(Abre_eleitos) && linha.contains(fecha_eleitos)) {
                                    inicio=linha.indexOf(Abre_eleitos)+Abre_eleitos.length();
                                    fim=linha.indexOf(fecha_eleitos);
                                    eleitos=Integer.parseInt(linha.substring(inicio, fim));

                                    
                                }
                                if (linha.contains(Abre_cargos) && !titulo.equals("")&&(digitos<0)) {
                                    eleicao=new Periodo_Eleitorial(nome,titulo,vice,digitos,eleitos);
                                    eleicoes.add(eleicao);
                                }
                            }
                        }
                        br.close();

                    }
                }

                    catch (FileNotFoundException ex){
                        System.err.println(ex);
                    }
                    catch(IOException ex){

                        System.err.println(ex);
                    }
                    return eleicoes;

                }
        return eleicoes;

        }
    
     


    public static ArrayList<Mesario> lerMesario(){
        String login="";
        String senha="";
        boolean lendoMesario=false;
        boolean contemLogin=false;
        boolean contemSenha=false;

        
    }

