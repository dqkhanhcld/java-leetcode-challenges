class Solution {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        //base case
        if(length == 0) return 0;
        // set variables
        int min= nums[0];
        int max = nums[0]; 
        int result = nums[0];
        
        for(int i =1; i< length; i++) {
            int temp_max =Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]) ) ;
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));
            
            max = temp_max;
            result = Math.max(result, max);
        }
        
        return result;
        
    }
}