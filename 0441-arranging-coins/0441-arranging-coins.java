class Solution {
    public int arrangeCoins(int n) {
        int j=0,k=n;
        for(int i=1;i<=k;i++){
            if(k-i>=i || k-i==0){
                k=k-i;
                j++;
                if(k==0)
                break;
            }
        }
        return j;
    }
}