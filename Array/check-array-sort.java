class CheckArraySort {
    public static void main(String[] args) {
        int[] array = { 10, 11, 12, 13, 14, 15 };
        System.out.println(checkArraySorted(array));
    }

    static boolean checkArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
