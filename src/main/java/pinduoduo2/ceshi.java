package pinduoduo2;

public class ceshi {

}
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();


        while (n >0 && m > 0) {

        }
        if (k >=  n * m) {
            return;
        }
        int [] array = new int[n * m];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m ; j++) {
                array[i*m + j] = i+1 + j * (i+1);
            }
        }
        Arrays.sort(array);
        int count = n * m - 1;
        System.out.println(array[count-k + 1]);
    }
*/

       /* public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextLong();
            }
            Arrays.sort(array);

            double result = 0;
            int temp = 1;
            for (int i = 0;i < n; i++) {
                while (array[i] >= temp) {
                    for (int j = 0; j < n; j++) {

                        result += temp * (1/array [j]);
                    }
                }
            }
}*/
