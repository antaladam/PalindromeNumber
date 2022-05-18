package Solution;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        int original = x;
        int reversed = 0;
        while(x != 0) {

            // get last digit from num
            int digit = x % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            x /= 10;
        }
        return reversed == original ? true : false;
    }
}
