package com.java_algos.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!'

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to capitalize: ");
        String str = scanner.nextLine();

        System.out.println(capitalize(str));
        scanner.close();
    }

    public static String capitalize(String str) {
       ArrayList<String> words = new ArrayList<String>(Arrays.asList(str.split(" ")));

        for( int i = 0; i < words.size(); i++ ) {
            String word = words.get(i);
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            words.set(i, word);
        }

        str = String.join(" ", words);

        return str;
    }
}
