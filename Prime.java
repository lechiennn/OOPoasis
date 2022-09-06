public class Prime {
    /**
     * check prime.
     * @param n is n.
     * @return if n is prime.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(1));
        System.out.println(isPrime(23));
        System.out.println(isPrime(45));
    }
}