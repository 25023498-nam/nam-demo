public class Solution5 {
    static int gcd(int a, int b) {
        if (a == 0) return b;
        else return gcd(b%a, a);
    }

    public static void main(String[] args) {
        int a = 42;
        int b = 48;
        System.out.println(gcd(a, b));
    }
}
