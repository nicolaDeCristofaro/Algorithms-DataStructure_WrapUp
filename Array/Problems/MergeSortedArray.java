package Array.Problems;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int mIndex = 0, nIndex = 0;
        int[] temp = new int[m+n];
        for (int i = 0; i< m+n; i++){
            //m could be different from n so we have to be careful with these conditions
            if (m > 0 && n > 0){
                if( mIndex == m) temp[i] = nums2[nIndex++];
                else if( nIndex == n) temp[i] = nums1[mIndex++];
                else if ((mIndex < m) && (nIndex < n) ){ 
                    if(nums1[mIndex] <= nums2[nIndex])  temp[i] = nums1[mIndex++];
                    else temp[i] = nums2[nIndex++];
                }
            }else if(m > 0 && n == 0){
                temp[i] = nums1[mIndex++];
            }else if(m == 0 && n > 0){
                temp[i] = nums2[nIndex++];
            }
        }
        
        //Take temp values into nums1 values
        for(int i=0; i< m+n; i++) nums1[i] = temp[i];
    }
}
