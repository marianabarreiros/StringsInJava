/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstring;

/**
 *
 * @author aluno
 */
public class ComparingString {
    String palavra = new String("mariana");
    String meuNome = "Mariana Barreiros";
    String outroNome = "Vitor";
    
//    testa se a string contida nos dois objetos são iguais
    public boolean isEquals(String nome){
        if(palavra.equals(nome))
            return true;
        return false;
    }
//    para referẽncias, se os dois objetos fazem referência para o mesmo objeto na memória
    public boolean eIgual(String nome){
        if(palavra == nome)
            return true;
        return false;
    }
//    Não importa se as letras são maiúsculas ou nn
    public void IgnoreCase(String nome){
        if(palavra.equalsIgnoreCase(nome)){
            System.out.println("nome passado iqual a palava");
        }
        else{
            System.out.println("nome passado não é igual a palavra");
        }

    }
    
    public void endsWith(String nome){
        if(meuNome.endsWith(nome)){
            
            System.out.println("o nome passado está no final da String");
        }
        else{
            
            System.out.println("o nome passado não está no final da String");
        }
    }
    
    
}
