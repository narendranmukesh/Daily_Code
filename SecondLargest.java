public class SecondLargest {

    public int secondLargestElement(int[] nums) {

        int  largest=Integer.MIN_VALUE;
        int  secondLargest=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num<largest){
                secondLargest=num;
            }
        }
        return(secondLargest==Integer.MIN_VALUE)?-1: secondLargest;
        
 
    }
}