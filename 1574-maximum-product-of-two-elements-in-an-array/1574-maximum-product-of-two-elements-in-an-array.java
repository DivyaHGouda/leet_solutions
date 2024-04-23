class Solution {
    public int maxProduct(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if((nums[i]-1)*(nums[j]-1)>res)
                    res=(nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return res;
    }
}