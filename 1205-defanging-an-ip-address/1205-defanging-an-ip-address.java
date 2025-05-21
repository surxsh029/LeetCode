class Solution {
    public String defangIPaddr(String address) {
        int i=0;
        StringBuilder result= new StringBuilder();
        while(i < address.length()){
            char car=address.charAt(i);
            if(car=='.'){
                result.append("[.]");
            }
            else{
                result.append(car);
            }
            i++;
        }
        return result.toString();
    }
}