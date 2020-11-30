class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray=new int[nums1.length+nums2.length];
        int len=mergedArray.length;
        
        for(int i=0;i<nums1.length;i++)
        {
            mergedArray[i]=nums1[i];
            System.out.println(nums1[i]);            
        }
        
        for(int j=0;j<nums2.length;j++)
        {
            mergedArray[j+nums1.length]=nums2[j];
            System.out.println(nums2[j]);
        }
        
        Arrays.sort(mergedArray);
    
        if(len%2!=0)
        {
            return mergedArray[mergedArray.length/2];
        }
        else
        {
            return (double)(mergedArray[(len/2)-1]+mergedArray[(len/2)])/2;
        }
    }
}
