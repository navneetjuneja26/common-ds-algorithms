import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int []intArray = {20,35,-15,7,55,1,-22};
        int index = linearSearch(intArray,35);
        System.out.println("Element found at the index " + index);
        boolean found = justFind(intArray,3121);
        System.out.println(found);
    }
//    Worst case is for the very last item in the array ( o(n) )
    // Best case is when the element is found at the very first index of the array
    public static int linearSearch(int arr[],int elem) {

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elem) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static boolean justFind(int arr[],int elem) {
        final boolean[] found = {false};
        Arrays.stream(arr).forEach(e -> {
            if(found[0] != true) {
                if (e == elem) {
                    found[0] = true;
                }
            }
        });
        return found[0];
    }

}
