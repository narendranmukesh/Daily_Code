package Stacks;
import java.util.Arrays;

public class LeftRotateByOne {
    public static void leftRotateByOne(int[] arr){
        if(arr.length==0) return;

        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println("Original Array: " + Arrays.toString(arr));
    leftRotateByOne(arr);
    System.out.println("Array after left rotation by one: " + Arrays.toString(arr));
    
}
    
}
