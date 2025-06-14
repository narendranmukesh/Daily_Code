    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MinimumExcludedValue {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // Read the size of the array

        String[] input = br.readLine().split(" "); // Read the array elements as a string array
        int[] arr = new int[n]; // Create an integer array of size n

        HashSet<Integer> seen = new HashSet<>(); // To store elements we have seen so far
        int mex = 0; // Start with the smallest non-negative integer (mex)

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]); // Convert string to int and store in arr
            seen.add(arr[i]); // Add the element to the set of seen numbers

            // Now calculate the current mex
            while (seen.contains(mex)) {
                mex++; // If current mex is present in the set, try next number
            }

            // Print the mex value for this prefix
            System.out.print(mex + " ");
        }
    }
}

    


// 🧠 Example Walkthrough for Input: 1 0 2 2 3 4
// Let’s trace the first few iterations:

// Iteration 0 (i = 0)
// arr[0] = 1

// seen = {1}

// mex = 0 (since 0 is not in seen)

// Printed: 0

// Iteration 1 (i = 1)
// arr[1] = 0

// seen = {0,1}

// mex = 2 (0 & 1 are present)

// Printed: 2

// Iteration 2 (i = 2)
// arr[2] = 2

// seen = {0,1,2}

// mex = 3

// Printed: 3

// ... and so on.