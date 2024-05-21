class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new LinkedList<>(hash.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        StringBuilder out=new StringBuilder();
        for(Map.Entry<Character,Integer> entry: list){
            for(int i=0;i<entry.getValue();i++){
            out.append(entry.getKey());
            }
        }
        
        return out.toString();
    }
}