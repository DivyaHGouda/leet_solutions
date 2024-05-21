class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!h.contains(nums[i])){
                h.add(nums[i]);
            }
            else{
                h.remove(nums[i]);
            }
        }
        List<Integer> l=new ArrayList<>(h);
        int[] a=new int[l.size()];
        for(int j=0;j<a.length;j++){
            a[j]=l.get(j);
        }
        return a;
    }
}