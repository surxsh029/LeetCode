class Solution {
    public String largestOddNumber(String num) {
        int count = 0;
        for(int i=num.length() - 1; i>=0; i--){
            if(num.charAt(i) == '1' || num.charAt(i) == '3' || num.charAt(i) == '5' || num.charAt(i) == '7' || num.charAt(i) == '9'){
                num = num.substring(0, i+1);
                count = 1;
                break;
            }
        }

        if(count == 1) return num;
        return "";
    }
}