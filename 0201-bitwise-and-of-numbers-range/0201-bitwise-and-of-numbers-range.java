class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(left<right){
            left=left&(left+1);
            if(left==0)
            return 0;
            right=right&(right-1);
        }
        return left&right;
    }
   
}