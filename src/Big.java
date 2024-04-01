import java.math.BigInteger;

public class Big {
    public static BigInteger Factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void Factorialtable(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "! = " + Factorial(i));
        }
    }
    public static void main (String[] args) {
        Factorialtable(30);
    }
}