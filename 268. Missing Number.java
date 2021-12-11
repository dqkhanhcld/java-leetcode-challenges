class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;  
        int series = 0;  
        for (int num : nums)
            series += num;
          return sum - series;
    }
    
    
}