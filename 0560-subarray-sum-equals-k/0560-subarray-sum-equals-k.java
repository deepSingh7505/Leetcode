class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>val=new HashMap<>();
        val.put(0,1);
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int que=sum-k;
            res+=(val.get(que)==null)?0:val.get(que);
            val.put(sum,(val.get(sum)==null)?1:val.get(sum)+1);
        }
        return res;
    }
}