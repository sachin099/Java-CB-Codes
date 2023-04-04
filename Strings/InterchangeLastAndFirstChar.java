package Strings;

import java.util.Scanner;

public class InterchangeLastAndFirstChar {
        public static void main(String []args){
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           String[] sArr = s.split(" ");
           String res = "";
           char first = ' ', last = ' ';
           for(int i=0; i<sArr.length; i++) {
               first = sArr[i].charAt(0);
               last = sArr[i].charAt(sArr[i].length()-1);
               sArr[i] = sArr[i].substring(0, 0) + last + sArr[i].substring(1);
               sArr[i] = sArr[i].substring(0, sArr[i].length()-1) + first;
               res = res.concat(sArr[i]);
               if(i != sArr.length - 1) {
                   res = res.concat(" ");
               }
           }
           System.out.println(res);
        }
}
