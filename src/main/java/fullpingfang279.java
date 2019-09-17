public class fullpingfang279 {
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
    int result = numSquares(8935);
        System.out.println(result);
    }

    public static int numSquares(int n) {
        return solution(n, 0);
    }
    public static int solution(int n, int count) {
        if (count >= min) return count;
        int mark = 0;
        if( n == 0) return count;
        if(n == 1) return 1 + count;
        for(int i = n /2 + 1; i>0 ;i--) {
            if(i * i >= n && (i - 1) * (i -1) <= n) {
                mark = i - 1;
                break;
            }
        }
        for(int j = mark; j > 0; j--) {
            int temp = solution(n - j * j, count + 1);
            if (temp < min) min = temp;
        }
        return min;
    }
}
