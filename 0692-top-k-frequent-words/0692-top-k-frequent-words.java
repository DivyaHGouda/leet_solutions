class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hash=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String x=words[i];
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        List<Map.Entry<String,Integer>> list=new LinkedList<>(hash.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
                int freq=(o2.getValue()).compareTo(o1.getValue());
                if(freq!=0){
                    return freq;
                }
                else
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });
        List<String> l=new ArrayList<>();
        for(int i=0;i<k;i++){
            l.add(String.valueOf(list.get(i).getKey()));
        }
        return l;
    }
}