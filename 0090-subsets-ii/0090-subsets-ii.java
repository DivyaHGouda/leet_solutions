class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> h=new HashSet<>();
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        subset(0,nums.length,h,nums,l);
        return new ArrayList<>(h);
    }
    public void subset(int i,int n,HashSet<List<Integer>> h,int []nums,List<Integer> l){
        
        if(i==n){
            h.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        subset(i+1,n,h,nums,l);
        l.remove(l.size()-1);
        while(i+1<n && nums[i]==nums[i+1]){
            i++;
        }
        subset(i+1,n,h,nums,l);
    }
}