class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>result1=new ArrayList<>();
        boolean added=false;
        for(int i=0;i<intervals.length;i++){
           int  start=intervals[i][0];
            if(added==false&&start>=newInterval[0]){
                result1.add(newInterval);
                added=true;
            }
            result1.add(intervals[i]);
        }
        if (!added) result1.add(newInterval);

        intervals =result1.toArray(new int[result1.size()][]);
        
        List<int[]>result=new ArrayList<>();
        int start1=intervals[0][0];
        int end1=intervals[0][1];
      for(int i=1;i<intervals.length;i++){
        int start2=intervals[i][0];
        int end2=intervals[i][1];
        if(start2<=end1){//overlap
        end1=Math.max(end1,end2);
        continue;
        }
        result.add(new int[]{start1,end1});
        start1=start2;
        end1=end2;
      }  
      result.add(new int []{start1,end1});
      return result.toArray(new int[result.size()][]);
        

    }
}