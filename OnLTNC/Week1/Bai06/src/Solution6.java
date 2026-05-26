public class Solution6 {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        else {
            for ( int i = 2; i < n; i++) {
                if ( n % i == 0 ) return false;
            }
            return true;
        }
    }

    static void main(String[] args) {
        int a = 47;
        int b = 46;
        System.out.println(isPrime(b));
        System.out.println(isPrime(a));
    }
}
