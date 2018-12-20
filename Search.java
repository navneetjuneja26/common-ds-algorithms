import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int index = linearSearch(intArray, 35);
        System.out.println("Element found at the index " + index);
        boolean found = justFind(intArray, 3121);
        System.out.println(found);
        int bs_index = binarySearchIteratively(intArray,-15);
        System.out.println(bs_index);
        int recursionIndex = binarySearchRecursively(intArray,-15);
        System.out.println(recursionIndex);
    }

    //    Worst case is for the very last item in the array ( o(n) )
    // Best case is when the element is found at the very first index of the array
    public static int linearSearch(int arr[], int elem) {

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean justFind(int arr[], int elem) {
        final boolean[] found = {false};
        Arrays.stream(arr).forEach(e -> {
            if (found[0] != true) {
                if (e == elem) {
                    found[0] = true;
                }
            }
        });
        return found[0];
    }

    public static int binarySearchIteratively(int[] arr, int elem) {
        int start = 0;
        int end = arr.length;
        while(start < end) {
            int mid = (start+end)/2;
            if(arr[mid] == elem){
                return mid;
            }else if(arr[mid] < elem) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return -1;
    }
    public static int binarySearchRecursively(int []arr,int value) {
        return binarySearchRecursively(arr,0,arr.length,value);
    }
    public static int binarySearchRecursively(int []arr,int start,int end,int elem) {
        if(start >= end) return -1;
        int mid = (start+end)/2;
        System.out.println("midpoint" + mid);
        if(arr[mid] == elem ) {
            return mid;
        }else if(arr[mid] < elem) {
            return binarySearchRecursively(arr,mid+1,end,elem);
        }else if(arr[mid] > elem) {
            return binarySearchRecursively(arr,start,mid,elem);
        }
        return -1;
    }
}


