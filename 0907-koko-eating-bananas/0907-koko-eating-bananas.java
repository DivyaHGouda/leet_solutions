class Solution {
    public int max(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for(int k=0;k<piles.length;k++){
            if(maxi<piles[k])
            maxi=piles[k];
        }
        return maxi;
    }
    public int findtotal(int[] arr,int mid){
        int x=0;
        for(int i=0;i<arr.length;i++){
            x+=Math.ceil((double)arr[i]/(double)(mid));
        }
        return x;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0,high=max(piles);
        int mid=0;
        int total=0;
        while(low<=high){
            mid=(low+high)/2;
            total=findtotal(piles,mid);
            if(total<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }    
        }
        return low;
    }
    
}