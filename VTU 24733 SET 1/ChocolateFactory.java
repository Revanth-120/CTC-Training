import java.util.Scanner;
public class ChocolateFactory {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            arr[i] = myobj.nextInt();
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }
        while (pos < n) {
            arr[pos++] = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(" ");
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}