class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int sum = 0;
        int res = 0;
        for (int num : nums) {
            sum += num;
            int q = sum % k;
            if (q < 0) q += k;
            res += count[q];
            count[q]++;
        }
        return res;
    }
}