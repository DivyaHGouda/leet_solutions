class Solution {
    public int[] countBits(int n) {
        int c=0,j=0,k=0;
        int []a=new int[n+1];
        for(int i=0;i<=n;i++){
            j=i;
            if(i==0){
            a[i]=0;}
            
            else{
                while(j!=0){
                    k=j%2;
                    if(k==1){
                        c+=1;
                    }
                    j=j/2;
                }
                a[i]=c;
                c=0;
            }
        }
        return a;
    }
}