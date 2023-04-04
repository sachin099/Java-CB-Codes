import java.util.*;
public class SecondLargest{
    
     public static void main(String []args){
        
        int[] a = {1,2,3,7,5,6};
        int max = a[0];
        int prevMax = 0;
        for(int i =0; i<a.length; i++) {
            if(a[i] > prevMax && a[i]<=max) {
                prevMax = a[i];
            }
            if(a[i]>max) {
                prevMax = max;
                max = a[i];
            }
        }
     }
}
