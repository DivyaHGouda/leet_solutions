class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums1[]=new int[2*nums.length];
        int i=0;
        for( i=0;i<nums.length;i++){
            nums1[i]=nums[i];
        }
        int k=0;
        for(int j=i;j<nums1.length;j++){
            nums1[j]=nums[k];
            k++;
        }
        return nums1;
    }
}