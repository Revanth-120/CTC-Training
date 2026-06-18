import java.util.Scanner;
public class MysteriousMethod {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        long n = myobj.nextLong();
        int r = myobj.nextInt();
        if (r == 0) {
            System.out.println(0);
            return;
        }
        long digitSum = sumOfDigits(n);
        long total = digitSum * r;
        while (total >= 10) {
            total = sumOfDigits(total);
        }
        System.out.println(total);
    }
    static long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}