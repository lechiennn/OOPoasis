public class Fibonacci {

    /**
     * fibonacci sequence.
     *
     * @param n is position.
     * @return number in position n.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        long f0 = 0;
        long f1 = 1;
        long f = 1;
        for (int i = 1; i < n; i++) {
            if (Long.MAX_VALUE - f0 > f1) {
                f = f0 + f1;
                f0 = f1;
                f1 = f;
            } else {
                return Long.MAX_VALUE;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(23));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(93));
    }
}
