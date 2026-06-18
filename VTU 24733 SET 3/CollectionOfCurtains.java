import java.util.Scanner;
public class CollectionOfCurtains {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String str = myobj.next();
        int l = myobj.nextInt();
        int maxAqua = 0;
        for (int i = 0; i < str.length(); i += l) {
            String subset = str.substring(i, Math.min(i + l, str.length()));
            int countA = 0;
            for (int j = 0; j < subset.length(); j++) {
                if (subset.charAt(j) == 'a') {
                    countA++;
                }
            }
            if (countA > maxAqua) {
                maxAqua = countA;
            }
        }
        System.out.println(maxAqua);
    }
}