class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int i=-1; //ponits zeros
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                i=j; // store the first zero index
                break;
            }
        }
        if(i==-1){
            return;
        }
        for(int j=i+1 ;j<nums.length;j++){ 
            if(nums[j]!=0){  // j points non zero elements then just swap
                int t = nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }
        }
    }
}