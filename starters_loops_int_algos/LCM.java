package starters_loops_int_algos;
import java.util.*;
public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int i = 2;
        int lcm = 1;
        while(n > 1 || m > 1) {
            while(n%i == 0 || m%i == 0) {
                if(n%i == 0) {
                    n = n/i;
                }
                if(m%i == 0) {
                    m = m/i;
                }
                lcm = lcm * i;
            }
            i++;
        }
        System.out.println(lcm);
    }
}
