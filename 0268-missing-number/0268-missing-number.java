class Solution {
    public int missingNumber(int[] nums) {
        int ActualSum =0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            ActualSum+=i;
        }
        return ActualSum-sum;
    }
}