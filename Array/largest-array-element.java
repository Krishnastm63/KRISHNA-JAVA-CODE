
class LargestArray {
    public static void main(String[] args) {
        int[] array = { 60, 72, 62, 12, 54, 23, 11, 45 };
        System.out.println(getLargestArrayElement(array));
    }

    static int getLargestArrayElement(int arr[]) {
        // Arrays.sort(arr);
        // int largestElement = arr[arr.length - 1];
        int largestElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] > largestElement) {
                    largestElement = arr[i + 1];
                }
            }
        }
        return largestElement;
    }
}
