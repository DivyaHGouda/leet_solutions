class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
            res=nums[i];
            break;
            }
            h.add(nums[i]);
        }
        return res;
    }
}