class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String m;
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            m=words[i];
            for(int j=0;j<m.length();j++){
                if(m.charAt(j)==x){
                    a.add(i);
                    break;
                }
            }
        }
        return a;
    }
}