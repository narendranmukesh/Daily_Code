import java.util.Stack;

public class ReverseAStack {

    // Step 1: Push element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }

    // Step 2: Reverse the stack recursively
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();          // Pop top element
        reverse(stack);                 // Recursively reverse the rest
        pushAtBottom(top, stack);       // Push top at the bottom
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("Reversed Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
