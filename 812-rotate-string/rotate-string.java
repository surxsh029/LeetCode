class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String rotated = s + s; // double the string

        return rotated.contains(goal); // if goal is a substring of rotated
    }
}
