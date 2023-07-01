class shiftByOne {
    public static void main(String[] args) {
        int[] array = { 10, 52, 42, 12, 54, 23, 11, 45 };
        int i = 0;
        int temp = array[0];
        for (i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            // System.out.print(array[i] + " ");
        }
        System.out.println(i);
        array[i] = temp;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
