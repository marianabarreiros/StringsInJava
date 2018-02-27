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

//        MÉTODO LENGHT AND CAPACITY
        System.out.println(string.length());
        System.out.println(string.capacity()); /*quem decide a capacidade?*/
        System.out.println(string.toString());
//        MÉTODO PARA MUDAR A CAPACIDADE E A O TAMANHO
        string.setLength(20);
        string.ensureCapacity(55);
        
        System.out.println(string.length());
        System.out.println(string.capacity()); 
        System.out.println(string.toString());
    }
}
