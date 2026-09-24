class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int bmax=nums[0];
       int sum=nums[0];
       int bmin=nums[0];
       for(int i =1;i<nums.length;i++){
        max=Math.max(max+nums[i],nums[i]);
        min=Math.min(min+nums[i],nums[i]);
        bmax=Math.max(max, bmax);
        bmin=Math.min(min,bmin);
        sum +=nums[i];
       }
       int res= Math.max(bmax,sum-bmin);
       if(bmax>0){
        return res;
       }
       else {
        return bmax;
       }
    }
}