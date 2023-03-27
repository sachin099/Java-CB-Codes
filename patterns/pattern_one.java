package patterns;

/*

This code prints the below pattern

* * * * * 
    * * * * 
        * * * 
            * * 
                * 

 */
public class pattern_one{
    public static void main(String []args){
       int n = 5;
       int counter = 5;
       int spaceCount = 0;
       while(n > 0) {
           int localCount = counter;
           int localSpaceCount = spaceCount;
           while(localSpaceCount > 0) {
               System.out.print("    ");
               localSpaceCount--;
           }
           while(localCount > 0) {
               System.out.print("* ");
               localCount--;
           }
           System.out.println();
           counter--;
           n--;
           spaceCount++;
       }
    }
}
