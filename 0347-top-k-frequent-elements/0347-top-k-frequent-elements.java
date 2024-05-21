class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(hash.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
    });
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i).getKey();
        }
        return res;
    }
}