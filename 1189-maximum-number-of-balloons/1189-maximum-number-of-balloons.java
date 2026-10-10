class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>map= new HashMap<>();
        Map<Character,Integer>bmap= new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int res=Integer.MAX_VALUE;
        bmap.put('b',1);
        bmap.put('a',1);
        bmap.put('l',2);
        bmap.put('o',2);
        bmap.put('n',1);
        for(char key : bmap.keySet()){
            int have = map.getOrDefault(key,0);
            int need = bmap.get(key);
            int pos = have/need;
            res=Math.min(res,pos);
        }
        return res;

    }
}