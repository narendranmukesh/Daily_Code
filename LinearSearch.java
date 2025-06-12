public class LinearSearch{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7,9,10};
        int target=11;
        int ans=linearSearch(nums,target);
        System.out.println(ans);

        
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length-1;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}