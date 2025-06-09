import java.lang.*;

public class HeapSort{
    public void sort(int arr[]){
        int n=arr.length;
        //STEP 1:Build  the  max heap
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);

        }
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);

        }
    }
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //STEP 2:Sort the array by extracting max element
    private void heapify(int[] arr, int n, int i) {
        int largest=i;
        int l=2*i+1; // left node
        int r=2*i+2; // right node

        if(l<n && arr[l]>arr[largest])
            largest=l;

        if(r<n && arr[r]>arr[largest])
            largest=r;

        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;


            heapify(arr,n,largest);
        }

}

    public static void main(String[] args) {
        int arr[]={12,11,13,5,6,7};
        int n=arr.length;

        HeapSort hp=new HeapSort();
        hp.sort(arr);

        System.out.println("Sorted array");
        printArray(arr);

    }
}