public class Solution9 {
    static int SumOfDigits(int n) {
        int res = 0;
        while (n !=0 ) {
            res += n%10;
            n /=10;
        }
        return res;
    }

    static void main(String[] args) {
        int n = 123125;
        System.out.println(SumOfDigits(n));
    }
}
