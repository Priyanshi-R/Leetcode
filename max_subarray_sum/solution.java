package max_subarray_sum;

public class solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MIN_VALUE;
        int currsum =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                min = Math.max(min,nums[i]);
            }if(nums[i]==0){
                min =0;
            }
        }
        for(int i=0;i<nums.length;i++){
            currsum += nums[i];
            if(currsum<0){
                currsum = 0;
            }
            if(max<currsum){
                max = currsum;
            }
        }
        if(max == 0){
            return min;
        } else{
            return max;
        } 
    }
}
