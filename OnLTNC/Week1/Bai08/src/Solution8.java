public class Solution8 {
    static int reverse(int n) {
        int last = 0;
        int res = 0;
        if (n > -10 && n < 10)  return n;
        while (n != 0 ) {
            last = n % 10;
            res = res*10 + last;
            n /= 10;
        }
        return res;
    }

    static boolean isPalindrome(int x) {
        return reverse(x) == x;
    }

    static void main(String[] args) {
        int t = 101;
        int k = 1012;
        System.out.println(isPalindrome(t));
        System.out.println(isPalindrome(k));
    }
}
