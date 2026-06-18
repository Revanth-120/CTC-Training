import java.math.BigInteger;
import java.util.Scanner;
public class TableConference {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        BigInteger circularWays = factorial(n - 1);
        BigInteger result = circularWays.multiply(BigInteger.valueOf(2)); 
        System.out.println(result);
    }
    static BigInteger factorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}