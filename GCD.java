public class GCD {

    /**
     * find gcd.
     * @param a is a.
     * @param b is b.
     * @return gcd.
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return Math.abs(b);
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(4, 16));
        System.out.println(gcd(5, 18));
        System.out.println(gcd(24, 36));
        System.out.println(gcd(0, 18));
    }
}
