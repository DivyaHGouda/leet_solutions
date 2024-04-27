class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> a=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                a.push(nums[i]%10);
                nums[i]=nums[i]/10;
            }
            while(!a.isEmpty()){
                arr.add(a.pop());
            }

        }
        int []answer=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}