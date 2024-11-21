package data_structure_algo;
import java.util.Scanner;

public class fLName {
    public static void main(String[] args) {
        String[] L = {"Hamed", "Ben", "UK", "", ""}; // Initial array with some names
        int i;
        int N=0;
        for(i=0;i<L.length;i++)
            {
                if(!L[i].equals(""))
                {
                    N++;

                }
            }
        int count = N; // Current count of names in the array (Hamed and ben)
        int j = 2; // Position where we want to insert the new name
        String name = "Mouna"; // Name to Insert
      

        // Check if there's space in the array
        if (count < L.length - 1) {
            // Check if the index j is valid for insertion
            if (j >= 0 && j <= count) {
                // Shift elements to the right to make space at index j
                for (i = count; i > j; i--) {
                    L[i] = L[i-1];
                }

                // Insert the new name at position j
                L[j] = name;
               count++; // Increase the count of elements
            }
        }

        // Print the updated array
        for (i = 0; i < L.length; i++) {
            System.out.println(L[i]);
        }
    }
}
