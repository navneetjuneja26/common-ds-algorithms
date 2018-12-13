import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myArray = {-2,3,5,-4,8,2,3,1,4};
        Arrays.sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
