import java.util.Scanner;
public class PricingFormat {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String n = myobj.next();
        int product = 1;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            product *= digit;
        }
        System.out.println(product);
    }
}