import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            int q= sum%k;
            q=(q<0)?k+q:q;
            res +=(map.containsKey(q))?map.get(q):0;
            map.put(q,(map.containsKey(q))?map.get(q)+1:1);
        }
        return res;
    }
}