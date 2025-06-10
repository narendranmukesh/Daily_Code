import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] data={122,431,65,22,1,47,47,787};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(data));
        RadixSort rs=new RadixSort();
        rs.radixSort(data,data.length);
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(data));

        
    }
    void countingSort(int arr[],int size,int place){

        int output[]=new int[size]; //output array
        int count[]=new int[10]; //count array for digits 0-9

        //initialize count array to 0
        for(int i=0;i<10;i++){
            count[i]=0;
        }

        //Store count of occurrences in count[]
        for(int i=0;i<size;i++){
            count[(arr[i]/place)%10]++;
        }

        //Change count[i] so that it now contains actual position of this digit in output[]
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }

        //Build the output array
        for(int i=size-1;i>=0;i--){
            output[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;
        }

        //Copy the output array to arr[], so that arr[] now contains sorted numbers according to current digit
        for(int i=0;i<size;i++){
            arr[i]=output[i];
        }

    }
    
    void radixSort(int arr[],int size){
        //first is to find the maximum number to know the number of digits
        int max=arr[0];
        for(int i=1;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        //Now we will do counting sort for every digit
        for(int p=1;max/p>0;p*=10)//p means place we1st iteration p=1 787/1, 2nd iteration p=10 787/10, 3rd iteration p=100 787/100 and so on
        {   
             countingSort(arr,size,p);

        }

    }
}
