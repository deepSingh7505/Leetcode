class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int diff=0;
        int res=0;
        for(int i =0;i<nums.length;i++){
            diff+=(nums[i]==1)?1:-1;
            if(diff==0){
                res=Math.max(res,i+1);
                continue;
            }
            if(map.containsKey(diff)){
                res=Math.max(res,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }
           
        }
        return res;
    }
}