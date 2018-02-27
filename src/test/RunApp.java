/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import comparingstring.ComparingString;


/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] Args){
        String s = new String();
        char[] charArray = new char[7];
        String s1 = "Mariana Barreiros";
        String nome = "mariana";
        String sobrenome = "Barreiros";
        String comEspaço = "   Regular: 2016(Mar)21   ";
        Object ref = "oi";
        
//     PEGANDO O TAMANHO

       /*System.out.println(s.length());
        System.out.println(charArray.length);;
        System.out.println(s1.length());
        
        //copiando uma string em um char
        s1.getChars(0, 7, charArray, 0);
        
        for(char s2: charArray){
            System.out.print(s2);
            
        }
        System.out.println();
        
        //pagando o index
        for(int i = 0; i<4; i++){
            System.out.print(s1.charAt(i));
            
        }
        System.out.println();*/
        
//      PARA O PACOTE COMPARINGSTRING....
        /*ComparingString cs = new ComparingString();
        
        System.out.println(cs.isEquals(nome));
        System.out.println(cs.eIgual(nome));
        
        cs.IgnoreCase(nome);
        cs.endsWith(sobrenome);

//      MÉTODO COMPARETO
        System.out.println(nome.compareTo(sobrenome));
        System.out.println(sobrenome.compareTo(nome));
        System.out.println(nome.compareTo(nome));

//      MÉTODO STARTWITH
        cs.startWith(s1);
        cs.startWith(nome, 2);*/
        
//       PARA OS MÉTODOS INDEXOF E LASTINDEXOF
//         IndexOf i = new IndexOf();
         /*System.out.println(s1.indexOf('a'));
         System.out.println(s1.indexOf('a', 3));
         System.out.println(s1.lastIndexOf('a'));
         System.out.println(s1.lastIndexOf('a', 4));*/
         
//      MÉTODO SUBSTRING
        /*System.out.println(s1.substring(2));
        System.out.println(s1.substring(0, 7));*/
        
//      MÉTODO PARA CONCATENAÇÃO
//        System.out.println(nome.concat(sobrenome));

//        MÉTODO REPLACE
        System.out.println(s1.replace('a', 'A'));

//        MÉTODO TOlOWERCASE e TOUPPERCASE
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        
//        MÉTODO TRIM
        System.out.printf("s3 after trim = \"%s\"%n%n", comEspaço.trim());
        
//        MÉTODO TOARRAY
        /*char[] toArray = s1.toCharArray();
        for(char character : toArray){
            System.out.print(character);
        }
        System.out.println(" ");*/
//        MÉTODO VALUEOF
        
           System.out.println(String.valueOf(ref));
        
    }
}
