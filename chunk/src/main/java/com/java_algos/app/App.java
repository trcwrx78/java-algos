package com.java_algos.app;

import java.util.Arrays;

// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

public class App 
{
    public static void main( String[] args )
    {
        int[] array = {1, 2, 3, 4, 5};
        int[][] result = chunk(array, 10);

        // Print result
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] chunk(int[] array, int size) {

        int nestedArrLength = (int)Math.ceil((double)array.length/size);
        int[][] nestedArray = new int[nestedArrLength][];
        int counter = 0;

        for(int i = 0; i < nestedArrLength; i++) {
            
            // Create subarray from counter to counter + size
            int[] subArray;
            if(counter + size > array.length) {
                subArray = Arrays.copyOfRange(array, counter, array.length);
            } else {
                subArray = Arrays.copyOfRange(array, counter, counter + size);
            }

            nestedArray[i] = subArray;

            // Increment counter by size
            counter += size;
        }

        return nestedArray;
    }
}
