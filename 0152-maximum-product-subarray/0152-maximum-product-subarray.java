class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int LeftProduct=1;
        int RightProduct=1;
        for(int i=0;i<nums.length;i++){
            if(LeftProduct==0){
                LeftProduct=1;
            }
            if(RightProduct==0){
                RightProduct=1;
            }
            LeftProduct=LeftProduct*nums[i];
            RightProduct=RightProduct*nums[nums.length-1-i];
            ans = Math.max(Math.max(LeftProduct,RightProduct),ans);
        }
        return ans;
    }
}