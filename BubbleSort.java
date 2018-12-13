public class BubbleSort {

        public static void main(String[] args) {
            int []myArray = {1,-2,0,3,21,2,-3,56,22};
            bubbleSort(myArray);
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            }
        }

    public static void swap(int []a, int i, int j) {
        if (i == j) return;
        int temp;
        if(a[i] > a[j]) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public static void bubbleSort(int []a) {
        for(int lastUnsortedIndex=a.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
            for(int i=0;i<lastUnsortedIndex;i++) {
                swap(a,i,i+1);
            }
        }
    }
}
