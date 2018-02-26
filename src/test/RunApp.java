/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] Args){
        String s = new String();
        char[] charArray = new char[7];
        String s1 = "Mariana Barreiros";
        //pegando tamando
        System.out.println(s.length());
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
        System.out.println();
    }
}
