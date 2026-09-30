class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i;
        int left =0;
        int right =0;
        int res = Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length)
        {
            sum += nums[right];
            while(sum>=target){
                int len= right-left+1;
                res=Math.min(res,len);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(res>nums.length)
        return 0;
        else
        return res;
    }
}