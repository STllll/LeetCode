public class heapsorttest {
    public static void main(String[] args) {
        int[] number = new int[]{4,7, 8, 2, 3, 10, 6, 5};
        sort(number);
        for (int a : number) System.out.print(a + " ");
    }

    public static void sort(int[] number) {
        int n = number.length;
        for(int i = n /2 - 1; i >= 0; i--){
            helper(number, i, n);
        }

        for(int i = n - 1; i > 0; i--) {
            swap(number, 0, i);
            helper(number, 0, i);
        }
    }

    public static void helper(int[] number, int i, int n) {
        int temp = number[i];
        for(int k = 2 * i + 1; k < n; k = 2 * k + 1) {
            if(k + 1 < n && number[k] < number[k + 1]) k++;
            if(number[k] > temp ) {
                number[i] = number[k];
                i = k;
            }
        }
        number[i] = temp;
    }

    public static void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
}
