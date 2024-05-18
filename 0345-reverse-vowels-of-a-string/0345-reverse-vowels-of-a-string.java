class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j){
            while(i<j && !isVowel(c[i])){
                i++;
            }
            while(i<j && !isVowel(c[j]) ){
                j--;
            }
            char x=c[i];
            c[i]=c[j];
            c[j]=x;
            i++;
            j--;
        }
        return new String(c);
    }
    public boolean isVowel(char l){
        return "AEIOUaeiou".indexOf(l)!=-1;
    }
}