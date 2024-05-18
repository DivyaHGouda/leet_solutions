class Solution {
     List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        subset(0,nums,ds);
        return ans;
    }
    public void subset(int i,int[] nums,List<Integer> ds){
        if(i==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        subset(i+1,nums,ds);
        ds.remove(ds.size()-1);
        subset(i+1,nums,ds);
        
    }
}