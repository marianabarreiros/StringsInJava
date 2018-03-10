/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenising;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author Win-7
 */
public class TokenisingString {
    public static void main(String[] Args){
        String fileName = "C:\\Users\\Win-7\\Desktop\\HotelReservation.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(System.out::println);
        } catch (Exception e) {
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a sentence and press Enter");
//        String sentence = scanner.nextLine();
//        String[] tokens = sentence.split(" ");
//        System.out.printf("Number of elements: %d%nThe tokens are:%n",tokens.length);
//        for (String token : tokens)
//        System.out.println(token);
    }
    
}
