public class Solution7 {
    static int reverse(int x) {
        int last = 0;
        int first = 0;
        if (x < 10 && x > -10) return x;
        else {
            while (x !=0) {
                last = x % 10;
                first = first * 10 + last;
                x /= 10;
            }
        }
        return first;
    }

    static void main(String[] args) {
        int a = 123;
        System.out.println(reverse(a));
    }
}

