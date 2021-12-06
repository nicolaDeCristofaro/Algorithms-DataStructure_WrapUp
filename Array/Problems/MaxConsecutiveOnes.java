package Array.Problems;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 1) count++;
            if (nums[i] == 0 || i == nums.length-1 ){
                if(count > max) max = count;
                count = 0;
            }
        }
        return max;
    }
}