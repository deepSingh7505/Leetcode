class Solution {
    public int pivotIndex(int[] nums) {
   int sum =0;
   for(int num:nums){
    sum+=num;
   }
   int pre=0; 
   if(sum-nums[0]==0){
    return 0;
   }    
   for(int i=1;i<nums.length;i++){
     pre+=nums[i-1];
     int suff=sum-pre-nums[i];
     if(pre==suff){
        return i;
     }
   }
    return -1;
    }
}