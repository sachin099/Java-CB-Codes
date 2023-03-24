import java.util.Scanner;

class SimpleCounter {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(count<=n) {
            System.out.println(count);
            count += 1;
        }
    }
}
