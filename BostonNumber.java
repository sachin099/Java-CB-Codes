import java.util.*;
public class BostonNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(sumOfFactors(n) == getDigitSum(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static int sumOfFactors(int n) {
        int factorizeNum = 2;
        int sum = 0;
        while(n >= 2) {
            while (n % factorizeNum == 0) {
                sum = sum + getDigitSum(factorizeNum);
                n = n / factorizeNum;
            }
            factorizeNum++;
        }
        return sum;
    }

    static int getDigitSum(int n) {
        int sum = 0;
        while(n>0) {
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}
