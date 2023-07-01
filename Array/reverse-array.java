
class ReverseArray {
    public static void main(String[] args) {
        int[] array = { 10, 52, 42, 12, 54, 23, 11, 45 };
        int[] arr2 = reverseArray(array);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    static int[] reverseArray(int arr[]) {
        int[] arr1 = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }
}
