class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k=k%n;
       if(k>n){
        return ;
       }
       Reverse(nums,0,n-1); 
       Reverse(nums,0,k-1); 
       Reverse(nums,k,n-1); 
    }
    private static void Reverse(int[] arr, int l,int r){
        while(l<r){
            int t = arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }
}