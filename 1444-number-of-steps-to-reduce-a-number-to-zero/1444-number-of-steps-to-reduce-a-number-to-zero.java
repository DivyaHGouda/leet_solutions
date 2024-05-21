class Solution {
    public int numberOfSteps(int num) {
        int res=0;
        while(num!=0){
            if(num%2!=0){
                num=num-1;
                res+=1;
            }
            else{
                num=num/2;
                res+=1;
            }
        }
        return res;
    }

}