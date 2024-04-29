class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
        return strs[0];
        String a;
        String b,res="";
        int p=0,o=0;
        a=strs[0];
        for(int i=1;i<strs.length;i++){
            b=strs[i];
            p=0;
            o=0;
            while( p<a.length() && o<b.length() && a.charAt(p)==b.charAt(o)){
                o++;
                p++;
            }
            res=a.substring(0,o);
            a=res;
        }
        return res;
    }
}