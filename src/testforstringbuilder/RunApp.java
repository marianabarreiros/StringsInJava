/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforstringbuilder;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] Args){
    
        StringBuilder string = new StringBuilder("Olá Mariana, como vai?");
        String var = "Mariana possui";
        int num = 25;
        String var2 = "anos de idade";

//        MÉTODO LENGHT AND CAPACITY
        /*System.out.println(string.length());
        System.out.println(string.capacity()); /*quem decide a capacidade?*/
//        System.out.println(string.toString());
//        MÉTODO PARA MUDAR A CAPACIDADE E A O TAMANHO
        /*string.setLength(20);
        string.ensureCapacity(55);
        
        System.out.println(string.length());
        System.out.println(string.capacity()); 
        System.out.println(string.toString());*/
        
//        MÉTODO CHARTAT E GETCHARS
       /* System.out.println(string.charAt(4));
        char[] charArray = new char[string.length()];
        string.getChars(0, 20, charArray, 0);
        for(char character : charArray){
            System.out.print(character);
        }*/
        
//       MÉTODO SETCHAR E REVERSE
        /*string.setCharAt(0, 'o');
        System.out.println(string.reverse());*/
        
//        MÉTODO APPEND
        System.out.println(string.append(var).append(num).append(var2));
    }
}
