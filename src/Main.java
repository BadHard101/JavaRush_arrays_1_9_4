import java.util.Arrays;

public class Main {
    public static int[] array = {9, 8, 7, 6, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] sarray = Arrays.copyOf(array,array.length);
        Arrays.sort(sarray);
        if (Arrays.binarySearch(sarray,element)>=0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}