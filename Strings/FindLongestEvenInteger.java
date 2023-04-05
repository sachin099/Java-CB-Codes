import java.util.*;
public class FindLongestEvenInteger {
    public static void main(String []args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String tempStr = "";
            String res = "";
            for(int i = 0; i<s.length(); i++) {
                tempStr = s.substring(0,i+1);
                if(Integer.parseInt(tempStr) % 2 == 0) {
                    res = tempStr;
                }
            }
            System.out.println(res);
        }
    }
}
