public class SelectionSort implements SortingAlgorithm {

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private int smallest(int[] a, int start) {
        int smallest = start;
        for (int i = start + 1; i < a.length; i++) {
            if (a[i] < a[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            swap(a, i, smallest(a, i));
        }
    }
}
