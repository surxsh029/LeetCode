class Solution {
    public boolean isSubsequence(String s, String t) {

        int count =0;

        for(int i =0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    t = t.substring(j+1);
                    count++;
                    break;
                }
            }
        }
        if(count==s.length()) return true;
        else return false;
        
    }
}