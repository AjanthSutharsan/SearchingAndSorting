

public class Question2
{
    public static void main(String[] args) {
       int[] myList = {12, 39, 45, 63, 84};
       int searchValue = 63;
       boolean found = false;
       int start = 0;
       int end = 4;
       int mid = 0;
       while (found == false && start<=end) {
           mid = (start+end)/2;
           if (myList[mid]==searchValue) {
               found = true;
            }
           else if (myList[mid] > searchValue) {
               end = mid - 1;
            }
           else {
               start = mid + 1;
            }
        }
       if (found == true) {
           System.out.println(searchValue+" was found at index position "+mid);
        }
       else {
           System.out.println(searchValue+" was not in this set");
        }
    }
}
