public class Fraction {
    private int numerator;
    private int denominator = 1;

    /**
     * Constructor.
     *
     * @param numerator   is numerator.
     * @param denominator is denominator.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    /**
     * set denominator.
     * @param denominator is denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * gcd.
     *
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

    /**
     * reduce.
     *
     * @return reduce.
     */
    public Fraction reduce() {
        int i = gcd(this.numerator, this.denominator);
        if (this.denominator < 0) {
            this.denominator = -this.denominator;
            this.numerator = -this.numerator;
        }
        this.numerator /= i;
        this.denominator /= i;
        return this;
    }

    /**
     * add 2 fr.
     *
     * @param fr is another fr.
     * @return sum.
     */
    public Fraction add(Fraction fr) {
        int num = this.numerator * fr.denominator
                + this.denominator * fr.numerator;
        int den = this.denominator * fr.denominator;
        Fraction newFraction = new Fraction(num, den);
        return newFraction.reduce();
    }

    /**
     * substract 2 fr.
     *
     * @param fr is another fr.
     * @return difference.
     */
    public Fraction subtract(Fraction fr) {
        int num = this.numerator * fr.denominator
                - this.denominator * fr.numerator;
        int den = this.denominator * fr.denominator;
        Fraction newFraction = new Fraction(num, den);
        return newFraction.reduce();
    }

    /**
     * multiply.
     *
     * @param fr is another fr.
     * @return product.
     */
    public Fraction multiply(Fraction fr) {
        int num = this.numerator * fr.numerator;
        int den = this.denominator * fr.denominator;
        Fraction newFraction = new Fraction(num, den);
        return newFraction.reduce();
    }

    /**
     * compare.
     *
     * @param obj is obj.
     * @return if 2 fr is equal.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Fraction)) {
            return false;
        }
        boolean equalNum = this.reduce().getNumerator()
                == ((Fraction) obj).reduce().getNumerator();
        boolean equalDen = this.reduce().getDenominator()
                == ((Fraction) obj).reduce().getDenominator();
        if (equalNum && equalDen) {
            return true;
        }
        return false;
    }

    /**
     * divide.
     *
     * @param fr is another.
     * @return quotient.
     */
    public Fraction divide(Fraction fr) {
        int num = this.numerator * fr.denominator;
        int den = this.denominator * fr.numerator;
        Fraction newFraction = new Fraction(num, den);
        return newFraction.reduce();
    }

    public void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1, 2);

        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));

        f1.reduce().printFraction();
        f1.add(f2).printFraction();
        f3.subtract(f1).printFraction();
        f1.multiply(f2).printFraction();
        f3.divide(f2).printFraction();
    }
}
