package Arrays;

import java.util.Arrays;
public class LeftRotateByd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;

        System.out.println("Original  Array:"+Arrays.toString(arr));
        leftRotateByd(arr, d);
        System.out.println("Array after left rotation by " + d + " positions: " + Arrays.toString(arr));
        }

    private static void leftRotateByd(int[] arr, int d) {
        int n=arr.length;
        //handling the  cases where  my d value is greater than the legnth of the array
        d=d%n;
        if(d==0) return;

        //reverse the first d elements
        reverse(arr, 0, d-1);
        //reverse the second part of elements
        reverse(arr, d, n-1);
        //reverse the entire array
        reverse(arr, 0, n-1);
       
    }
    //function  to reverse part of the array
    private static void  reverse(int[] arr,int start,int end){
        while(start<end){
            int  temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }

    
}
