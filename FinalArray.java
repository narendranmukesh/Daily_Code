


class FinalArray{
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
             int min=0;

            for(int j=1;j<nums.length;j++) {
            if(nums[j]<nums[min]){
                min=j;

            }
            
        }
        nums[min]*=multiplier;
        
    }
    return nums;
    }
}