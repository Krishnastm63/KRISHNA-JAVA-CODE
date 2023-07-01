import java.util.Arrays;

class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = { 10, 52, 42, 12, 54, 23, 11, 45 };
        System.out.println(findSecondLargestElement(array));
    }

    static int findSecondLargestElement(int[] arr) {
        Arrays.sort(arr);
        int secondLargestElement = arr[arr.length - 2];
        return secondLargestElement;
    }
}
