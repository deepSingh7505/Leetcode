class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer>have=new HashMap<>();
     for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);
       have.put(ch,have.getOrDefault(ch,0)+1);
     }
     int count=0;
     int res=0;
     for(int value :have.values()){
        if(value%2==1){
        res+=value-1;
        count++;
        }
        else{
        res+=value;
        }
     }
     if(count>0)
     return res+1;
     else 
     return res;
    }
}