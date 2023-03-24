import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        int start = 2;
        while(start < n){
            if(n%start == 0) {
                isPrime = false;
                break;
            }
            start = start+1;
        }
        System.out.println(isPrime);
    }
}
