package com.java_algos.app;

import java.util.Arrays;

// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

public class App 
{
    public static void main( String[] args )
    {


        anagrams("RAIL! SAFETY!", "fairy tales");
        anagrams("Hi there", "Bye there");
    }

    public static boolean anagrams(String str1, String str2) {
        // remove spaces and punctuation
        // convert to lowercase
        String regex = "[\\s.,;?!'\"/\\\\-]";
        String filteredStr1 = str1.replaceAll(regex, "").toLowerCase();
        String filteredStr2 = str2.replaceAll(regex, "").toLowerCase();

        // sort the strings
        String[] str1Arr = filteredStr1.split("");
        Arrays.sort(str1Arr);
        String[] str2Arr = filteredStr2.split("");
        Arrays.sort(str2Arr);

        // compare the strings
        String finalStr1 = String.join("", str1Arr);
        String finalStr2 = String.join("", str2Arr);

        boolean isAnagram = finalStr1.equals(finalStr2);

        // compares the two arrays
        // boolean isAnagram = Arrays.equals(str1Arr, str2Arr);
        
        if (isAnagram) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }

        return isAnagram;
    }
}