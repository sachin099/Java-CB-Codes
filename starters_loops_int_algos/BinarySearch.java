public class BinarySearch{

     /* A very simple program for binary search 
     ** of a sorted array
     */
  
     public static void main(String []args){
        int[] a = {1,2,3,4,4,5,6,7,7,8,9,10,23};
        int target = 5;
        int left = 0;
        int right = a.length - 1;
        while(left < right) {
            int mid = (left+right) / 2;
            if(a[mid] == target) {
                System.out.println(a[mid] + " found at index " + mid);
                break;
            } else if (a[mid] < target) {
                left++;
            } else {
                right --;
            }
        }
     }
}
