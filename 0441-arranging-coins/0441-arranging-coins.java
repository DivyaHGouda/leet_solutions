class Solution {
    public int arrangeCoins(int n) {
        int j=0,k=n,i=1;
        while(k>=i){
                k=k-i;
                j++;
                i++;
                if(k==0)
                break;    
        }
        return j;
    }
}