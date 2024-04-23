class Solution {
    public String truncateSentence(String s, int k) {
        int n=0;
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            n++;
            if(n==k){
            index=i;
            break;
            }
        }
        if(k>n)
        return s;
        return s.substring(0,index);

    }
}