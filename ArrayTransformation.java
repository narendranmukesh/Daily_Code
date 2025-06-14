import java.util.*;

public class ArrayTransformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int result = solve(N, A);
            System.out.println(result);
        }

        sc.close();
    }

    // Function to compute the number of operations or return -1 if impossible
    static int solve(int N, int[] A) {
        long sum = 0;

        for (int num : A) {
            sum += num;
        }

        // Check if the total sum is divisible by (N - 1)
        if (sum % (N - 1) != 0) {
            return -1;
        }

        long operations = sum / (N - 1);

        // Ensure no A[i] exceeds the number of operations possible
        for (int i = 0; i < N; i++) {
            if (A[i] > operations) {
                return -1;
            }
        }

        return (int) operations;
    }
}
