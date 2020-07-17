package tell;

public class quicksorttest {
    public static void main(String[] args) {
        int[] number = new int[]{3,45,7,1,3,56,23,4};
        quicksort(number, 0, number.length - 1);
        for(int a : number) System.out.println(a);
    }

    public static void quicksort(int[] number, int start, int end) {
        int s = start;
        int e = end;
        int mark = number[start];
        while (s < e) {
            while (s < e && number[e] >= mark) e--;
            number[s] = number[e];
            while (s < e && number[s] < mark) s++;
            number[e] = number[s];
        }
        number[s] = mark;
        if(s > start) quicksort(number, start, s - 1);
        if(e < end)  quicksort(number, e + 1, end);
    }
}
