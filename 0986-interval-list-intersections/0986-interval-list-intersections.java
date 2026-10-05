class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int []>result=new ArrayList<>();
        int start1;
        int end1;
        int start2;
        int end2;
        int i=0;
        int j=0;
        while(i<firstList.length&&j<secondList.length){
         start1 =firstList[i][0];
         end1 =firstList[i][1];
         start2 =secondList[j][0];
         end2 =secondList[j][1];
            if(start1<=start2){
                if(end1>=start2){
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    result.add(new int[]{s,e});
                }
            }else
            {
                if(end2>=start1)
                {
                     int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    result.add(new int[]{s,e});
                }
            }
            if(end1>end2){
                j++;
            }
            else{
                i++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}