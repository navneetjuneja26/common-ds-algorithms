import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []myArray = {1,2,-2,3,2,3,21,1,-2,3,0};
        selectionSort(myArray);
        printArray(myArray);
    }
    public static void selectionSort(int arr[]) {
        for(int lastUnsortedIndex = arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
            int largest = 0;
            for(int i=1;i<=lastUnsortedIndex;i++) {
                if(arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr,largest,lastUnsortedIndex);
        }
    }
    public static void swap(int arr[],int i,int j) {
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int arr[]) {
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
}