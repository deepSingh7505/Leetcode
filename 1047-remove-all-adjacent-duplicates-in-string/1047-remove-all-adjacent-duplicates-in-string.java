class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(st.empty()){
                st.push(a);
                continue;
            }
            if(st.peek()==a){
                st.pop();
                continue;
            }
            st.push(a);
        }
        s ="";
        while(!st.empty()){
            s+=st.peek();
            st.pop();
        }
        return new StringBuilder(s).reverse().toString();
    }
}