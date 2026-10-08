class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[temp.length];
        st.push(temp.length-1);
        for(int i=temp.length-2;i>=0;i--){
            while(!st.empty()&&temp[i]>=temp[st.peek()]){
                st.pop();
            }
            if(!st.empty()){
                ans[i]=st.peek()-i;
            }
            else{
                ans[i]=0;
            }
            st.push(i);
        }
        return ans;
    }
}