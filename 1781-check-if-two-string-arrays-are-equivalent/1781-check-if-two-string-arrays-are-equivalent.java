class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x=word1[0],y=word2[0];
        for(int i=1;i<word1.length;i++){
           x=x.concat(word1[i]);
        }
        for(int i=1;i<word2.length;i++){
            y=y.concat(word2[i]);
        }
        System.out.println(x);
        System.out.println(y);
        if(x.equals(y))
        return true;
        else
        return false;
    }
}