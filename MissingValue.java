package Arrays;

// public class MissingValue {
    


// }

//Better Approach
// public class MissingValue {
//     public static int missingNumber(int[] arr, int n) {
//         // Step 1: Create a hash array of size n+1
//         int[] hash = new int[n + 1];

//         // Step 2: Mark all the present numbers in the hash array
//         for (int i = 0; i < arr.length; i++) {
//             hash[arr[i]] = 1;
//         }

//         // Step 3: Find the number that is not marked in the hash array
//         for (int i = 1; i <= n; i++) {
//             if (hash[i] == 0) {
//                 return i;
//             }
//         }

//         // Just a fallback (should never reach here if input is valid)
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5};  // N = 5, missing = 3
//         int n = 5;
//         System.out.println("Missing number is: " + missingNumber(arr, n));
//     }
// }

public class MissingValue{
    public  static int missingNumber(int[] arr,int N){
        int xor1=0,xor2=0;
        // Step 1: Calculate XOR of all elements in the array
        for(int i=0;i<arr.length;i++){
            xor2=xor2^arr[i];

        }
        for(int i=1;i<=N;i++){
            xor1=xor1^i;
        }
        return xor1 ^ xor2; // Step 2: XOR of the two results gives the missing number
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int N=5; // The maximum number in the range
        System.out.println("Missing number is: " + missingNumber(arr, N));
    }

}
