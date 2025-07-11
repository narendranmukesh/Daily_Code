package Arrays;

public class AppearsOnce {
    


    public static int getSingleElement(int[] arr) {
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];  // XOR each element
        }

        return xor;  // Remaining value is the single element
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("The single element is: " + getSingleElement(arr));
        // Output: 2
    }
    
}




