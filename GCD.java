import java.util.*;
public class GCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        int max = i;
        while(i<=n && i<=m) {
            if(n%i == 0 && m%i == 0) {
                max = i;
            }
            i++;
        }
        System.out.println(max);
    }
}
