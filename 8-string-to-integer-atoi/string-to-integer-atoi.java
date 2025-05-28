class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0){
            return 0;
        }

       int sign=1;
       int i=0;
       long result=0;

       if(s.charAt(i)=='+'||s.charAt(i)=='-'){
        if(s.charAt(i)=='-'){
            sign=-1;
        }
        i++;
       }
       while(i<s.length()){
        char c=s.charAt(i);
        if(!Character.isDigit(c)){
            break;
        }

        int digit=c-'0';
        result=result*10+digit;

        if(sign==1 && result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign==-1 && (-1 * result)<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        i++;
       }

       return (int)(sign*result);

    }
}