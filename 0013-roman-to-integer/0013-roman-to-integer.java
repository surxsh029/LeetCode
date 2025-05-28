class Solution {
    public int romanToInt(String s) {

        int total=0;

    
    for (int i =0;i<s.length();i++){
        char ch=s.charAt(i);
        int val1=0;
        if(ch=='I') val1=1;
        else if(ch=='V') val1=5;
        else if(ch=='X') val1=10;
        else if(ch=='L') val1=50;
        else if(ch=='C') val1=100;
        else if(ch=='D') val1=500;
        else if(ch=='M') val1=1000;
        
        if (i + 1 < s.length()) {
        int val2 = 0;
        char next = s.charAt(i + 1);
        if (next == 'I') val2 = 1;
        else if (next == 'V') val2 = 5;
        else if (next == 'X') val2 = 10;
        else if (next == 'L') val2 = 50;
        else if (next == 'C') val2 = 100;
        else if (next == 'D') val2 = 500;
        else if (next == 'M') val2 = 1000;

        if (val1 < val2) {
            total -= val1;
        } else {
            total += val1;
        }
    } else {
        total += val1;
    }
    }
     return total;   
    }
}