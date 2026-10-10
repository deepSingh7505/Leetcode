class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>rmap=new HashMap<>();
        Map<Character,Integer>mmap=new HashMap<>();
        for(int i =0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            rmap.put(ch,rmap.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            mmap.put(ch,mmap.getOrDefault(ch,0)+1);
        }
        for(char key:rmap.keySet()){
            int r = rmap.get(key);
            int m = mmap.getOrDefault(key,0);
            if(r>m){
                return false;
            }
        }
        return true;
    }
}