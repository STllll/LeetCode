package tell;

public class guibingtest {
    public static void main(String[] args) {
        int[] number = new int[]{3,45,7,1,3,56,23,4};
        guibing(number, 0, number.length - 1);
        for(int a : number) System.out.println(a);
    }

    public static void guibing(int[] number, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            guibing(number, start, mid);
            guibing(number, mid + 1, end);
            sort(number, start, mid, end);
        }
    }

    public static void sort(int[] number, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int mark = 0;
        while(i <= mid && j <= end) {
            if(number[i] < number[j]) {
                temp[mark++] = number[i];
                i++;
            }
            else {
                temp[mark++] = number[j];
                j++;
            }
        }
        while(i <= mid) {
            temp[mark++] = number[i++];
        }
        while(j <= end) {
            temp[mark++] = number[j++];
        }

        for(int a : temp) {
            number[start++] = a;
        }
    }
}
