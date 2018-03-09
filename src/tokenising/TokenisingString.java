/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenising;

import java.util.Scanner;

/**
 *
 * @author Win-7
 */
public class TokenisingString {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are:%n",tokens.length);
        for (String token : tokens)
        System.out.println(token);
    }
    
}
