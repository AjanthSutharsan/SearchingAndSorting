

public class Question1
{
    public static void main(String[] args) {
       int[] myList = {12, 39, 45, 63, 84};
       int searchValue = 63;
       int total = 0;
       for (int i=0; i<5; i++) {
           if (myList[i]==searchValue) {
               System.out.println(searchValue+" was found at position "+i);
           }
           else {
               total += 1;
           }
       }
       
       if (total == 5) {
           System.out.println(searchValue+" was not in this set");
       }
    }


}
