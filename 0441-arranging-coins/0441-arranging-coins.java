class Solution {
    public int arrangeCoins(int n) {
        int j=0,k=n;
        int i=1;
        while(k>=i){
            k=k-i;
            j++;
            i++;
        }
        return j;
    }
}