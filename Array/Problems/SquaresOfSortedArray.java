package Array.Problems;

//Given an integer array nums sorted in non-decreasing order, 
//return an array of the squares of each number sorted in non-decreasing order.

//Simple Approach O(nlogn) complexity
class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        
        for (int i=0; i< nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

/*Another efficient solution is based on the two-pointer method as the array 
is already sorted we can compare the first and last element to check which is bigger and proceed with the result. 
*/

/*The ABS function returns the absolute value of a number. 
You can think about absolute value as a number's distance from zero on a number line. 
ABS converts negative numbers to positive numbers. Positive numbers and zero (0) are unaffected*/

//Time complexity: O(n) 
//Auxiliary Space: O(n) 

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] arr) {
        
        int n = arr.length, left = 0,right = n - 1;
        int result[] = new int[n];
     
        for(int index = n - 1; index >= 0; index--){
            if (Math.abs(arr[left]) > arr[right]){
                result[index] = arr[left] * arr[left];
                left++;
            }else{
                result[index] = arr[right] * arr[right];
                right--;
            }
        }
        return result;
    }
}

