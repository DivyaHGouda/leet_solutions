class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0,k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
                k++;
            }
        }
        
        return k;
    }
}