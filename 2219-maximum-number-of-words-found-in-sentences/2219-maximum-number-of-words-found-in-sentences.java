class Solution {
    public int mostWordsFound(String[] sentences) {
        int res=1,m=0;
        String x;
        for(int i=0;i<sentences.length;i++){
            x=sentences[i];
            for(int j=0;j<x.length()-1;j++){
                if(x.charAt(j)!=' ' && x.charAt(j+1)==' '){
                    res+=1;
                }
            }
            if(m<res)
            m=res;
            res=1;
        }
        return m;
    }
}