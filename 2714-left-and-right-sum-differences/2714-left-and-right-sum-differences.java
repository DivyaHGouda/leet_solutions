class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[]=new int[nums.length];
        int b[]=new int[nums.length];
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<a.length;i++){
            a[i]=leftsum;
            leftsum+=nums[i];
        }
        for(int i=b.length-1;i>=0;i--){
            b[i]=Math.abs(a[i]-rightsum);
            rightsum+=nums[i];
        }
        return b;
    }
}