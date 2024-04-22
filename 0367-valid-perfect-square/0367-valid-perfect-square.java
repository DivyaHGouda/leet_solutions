class Solution {
    public boolean isPerfectSquare(int num) {
        long i=num/2;
        long k=i;
        if(num==1)
        return true;
        while(i*i>num){
            k=i;
            i=i/2;    
        }
        for(long j=i;j<=k;j++){
            if(j*j==num)
            return true;
        }
        return false;
    }
}