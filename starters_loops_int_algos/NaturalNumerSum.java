package starters_loops_int_algos;
import java.util.*;
class NaturalNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(counter<=n) {
            sum = sum+counter;
            counter += 1;
        }
        System.out.println(sum);
    }
}
