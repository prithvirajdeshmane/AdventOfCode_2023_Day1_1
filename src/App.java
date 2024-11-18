/**	
 * @author: Prithviraj Deshmane
 * 
 * Problem Source:
 * Site: https://adventofcode.com
 * Year: 2023
 * Day: 1
 * Problem: #1
 * Problem Statement: https://adventofcode.com/2023/day/1
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Advent of Code 2023, Day 1, Problem #1 solution
 * This program reads from a file, extracts the first and last digits from each line that contains digits, 
 * computes the number formed by the first and last digits, and sums them.
 */
public class App {

    public static void main(String[] args) {
        int sum = 0;
        
        try (Scanner sc = new Scanner(new File("puzzleInput.txt"))) {
            // Loop through each line of the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                
                // Skip empty lines or lines without any digits
                if (line.isEmpty() || !line.matches(".*\\d.*")) {
                    continue;
                }
                
                // Initialize first and last digit as invalid values
                int firstDigit = -1;
                int lastDigit = -1;
                
                // Iterate through characters in the line
                for (char c : line.toCharArray()) {
                    if (Character.isDigit(c)) {
                        // Set firstDigit when we encounter the first digit
                        if (firstDigit == -1) {
                            firstDigit = Character.getNumericValue(c);
                        }
                        // Always update lastDigit to the most recent digit
                        lastDigit = Character.getNumericValue(c);
                    }
                }
                
                // If both first and last digits were found, compute the number
                if (firstDigit != -1 && lastDigit != -1) {
                    sum += (firstDigit * 10) + lastDigit;
                }
            }
        } catch (FileNotFoundException e) {
            // Handle case when the file is not found
        	System.out.println("Input file not found at provided path");
            e.printStackTrace();
        }
        
        // Output the final sum
        System.out.println(sum);
    }
}
