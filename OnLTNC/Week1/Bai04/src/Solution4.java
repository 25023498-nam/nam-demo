public class Solution4 {
    public static long fibonancci(long n) {
        if (n == 1 ) {return 1;}
        else if (n == 0) { return 0;}
        else if (n < 0) {return -1;}
        else if (n> 100) {return Long.MAX_VALUE;}
        else return fibonancci(n-1) + fibonancci(n-2);
    }

    static void main(String[] args) {
        long a = 10;
        long b = 20;
        long c = 101;
        System.out.println(fibonancci(c));
        System.out.println(fibonancci(a));
        System.out.println(fibonancci(b));
    }
}
