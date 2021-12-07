package Array.Problems;

import java.util.Arrays;

/*Given a fixed-length integer array arr, duplicate each occurrence of zero, 
shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. 
Do the above modifications to the input array in place and do not return anything.*/

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        
        int l = arr.length;
        
        //Let's first find how many 0 occurrences there are
        int zeros = 0;
        for (int i=0; i <arr.length; i++){
            if (arr[i] == 0) zeros++;
        }
        
        //Create an array that can hols arr + added zeros
        int[] temp = Arrays.copyOf(arr, l+zeros);

        int tempLength = l;
        for (int i=0; i <l; i++){
            if (temp[i] == 0){
                //Shift each element from tempLength-1 to i+1 to the right
                for(int j=tempLength-1; j>=i+1; j--){
                    temp[j+1] = temp[j];
                }
                //After the shift we can insert the new 0 at index i+1
                temp[i+1] = 0;
                tempLength++;
                i++;
            }
        }
        
        //Update the arr values with new values of temp
        for (int i=0; i <l; i++){
            arr[i] = temp[i];   
        }
    }
}
