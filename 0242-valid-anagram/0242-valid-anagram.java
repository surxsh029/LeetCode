class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        char [] sArr=s.toCharArray();
        char [] tArr=t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        boolean result=Arrays.equals(sArr,tArr);

        if(result){
            return true;
        }
        else{
            return false;
        }
        
    }
}