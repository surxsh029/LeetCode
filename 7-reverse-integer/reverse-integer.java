import java.util.*;

class Solution {
    public int reverse(int x) {
        int ans = 0;
        int count = 0;
        if (x < 0) {
            x = x * (-1);
            count = 1;
        }
        while (x > 0) {
            int digit = x % 10;
            x = x / 10;

            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + digit;
        }

        if (count == 1) {
            ans = ans * (-1);
        }

        

        return ans;
    }

}