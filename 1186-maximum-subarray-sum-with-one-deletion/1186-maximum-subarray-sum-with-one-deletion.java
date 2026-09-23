class Solution {
    public int maximumSum(int[] arr) {
        int nd=arr[0];
        int od=Integer.MIN_VALUE;
        int result=Math.max(nd,od);
        for(int i=1;i<arr.length;i++){
            int pnd=nd;
            int pod=od;
            nd=Math.max(pnd+arr[i],arr[i]);
            int v1;
            if(pod==Integer.MIN_VALUE)
            v1=arr[i];
            else
            v1=pod+arr[i];
            od=Math.max(v1,pnd);
            result=Math.max(result,Math.max(nd,od));
        }
        return result;
    }
}