package Array.Problems;

//Given an array nums of integers, return how many of them contain an even number of digits.
public class EvenNumbersOfDigits {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        
        for (int i=0; i<nums.length; i++){
            int digitNum = Integer.toString(nums[i]).length();
            if ((digitNum % 2) == 0) evenCount++;
        }
        return evenCount;
    }
}
