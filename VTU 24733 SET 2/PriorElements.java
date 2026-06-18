import java.util.Scanner;
public class PriorElements {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = myobj.nextInt();
        }
        int count = 1;
        int maxSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }
        System.out.println(count);
    }
}