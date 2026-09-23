class Solution {
    public int maxProduct(int[] nums) {
        int result =nums[0];
        int maxbest= nums[0];
        int minbest=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int v1=maxbest*nums[i];
            int v2=nums[i];
            int v3=minbest*nums[i];
            maxbest=Math.max(v1,Math.max(v2,v3));
            minbest=Math.min(v1,Math.min(v2,v3));
            result=Math.max(result,Math.max(minbest,maxbest));
        }
        return result; 
    }
}