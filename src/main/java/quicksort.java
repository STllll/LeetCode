public class quicksort {
    public static void main(String[] args) {
        int[] num = new int[]{2,4,1,8,6,11,7,5};
       quicksort(num, 0, num.length - 1);
       for(int a : num) System.out.println(a);
    }

    public static void quicksort(int[] num, int start, int end) {
        int down = start;
        int up = end;
        int mark = num[start];
        while(start < end) {
            while(mark < num[end] && start < end) end--;
            num[start] = num[end];
            while(mark > num[start] && start < end) start++;
            num[end] = num[start];
        }
        num[start] = mark;
        if(start > down) quicksort(num, down, start -1);
        if(end < up) quicksort(num, end + 1 , up);
    }
}
