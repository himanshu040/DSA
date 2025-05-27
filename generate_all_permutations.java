import java.util.Arrays;

class GenerateAllPermutations{
   public static void main(String[] args) {
        int[] array = {1, 2, 3};
        permute(array, 0);
    }

    static void permute(int[] arr, int start) {
        if (start == arr.length) {
            // Print current permutation
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            // Swap current index with the start
            swap(arr, i, start);

            // Recurse on the remaining portion
            permute(arr, start + 1);

            // Backtrack (undo the swap)
            swap(arr, i, start);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}