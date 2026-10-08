class pair{
    char ch;
    int num;
    pair(char ch,int num){
        this.ch=ch;
        this.num=num;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair>st=new Stack<>();
        char []res=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.empty()){
                st.push(new pair(c,1));
                continue;
            }
            if(st.peek().ch!=s.charAt(i)){
                st.push(new pair(c,1));
                continue;
            }
            if(st.peek().num<k-1){
                  pair change = st.peek();
                  st.pop();
                  st.push(new pair(change.ch,change.num+1));
                continue;
            }
            st.pop();
        }
    int index=0;
     while(!st.empty()){
        pair input = st.pop();
        while(input.num>0){
            res[index]=input.ch;
            index++;
            input.num--;
        }
     }
     String ss = new String(res, 0, index);
     String reversed = new StringBuilder(ss).reverse().toString();
     return reversed;
    }
}