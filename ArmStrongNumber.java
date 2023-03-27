import java.util.*;
public class ArmStrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = String.valueOf(n).length();
        int counter = power;
        int sum = 0;
        int resolver = n;
        while(counter > 0) {
            int temp = n%10;
            sum = sum + (int) Math.pow(temp,power);
            n = n/10;
            counter--;
        }
        if(sum == resolver) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
