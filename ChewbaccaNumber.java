import java.util.*;
public class ChewbaccaNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
        long chewNum = 0;
        while(n > 0) {
            if(n/10 == 0) {
                if(n == 9) {
                    n = n/10;
                    continue;
                }
            }
            int rem = (int) n%10;
            if(9-rem > rem) {
                chewNum = chewNum*10 + rem;
            } else {
                chewNum = chewNum*10 + 9-rem;
            }
            n = n/10;
        }
        long finVal = 0;
        while(chewNum > 0) {
            finVal = finVal*10 + chewNum%10;
            chewNum = chewNum/10;
        }
        System.out.println(finVal);
    }
}
