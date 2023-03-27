package starters_loops_int_algos;
import java.util.Scanner;

class ReturnNthFibo {
    public static void main(String[] args) {
        while(true)  {
        int first = 0;
        int second = 1;
        int counter = 2;
        int nthFibo = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2) {
            nthFibo = 0;
        }
        else if(n == 2) {
            nthFibo = 1;
        }
        else {
            while(counter<n) {
            nthFibo = first + second;
            first = second;
            second = nthFibo;
            counter++;
        }
        }
        System.out.println(nthFibo);
        }
    }
}
