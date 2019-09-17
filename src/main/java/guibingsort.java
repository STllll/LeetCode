public class guibingsort {
    public static void main(String[] args) {
        int[] num = new int[]{2,4,1,8,6,11,7,5};
        guibing(num, 0, num.length - 1);
        for(int a : num) System.out.println(a);
    }

    public static  void guibing(int[] num, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            guibing(num, start, mid);
            guibing(num, mid + 1, end);
            sort(num, start, mid, end);
        }
    }

    public static void sort(int[] num, int start,int mid, int end) {
        int[] temp = new int[num.length];
        int i = start;
        int j = mid + 1;
        int count = start;
        while(i <= mid && j <= end) {
            if(num[i] >= num[j]) temp[count++] = num[j++];
            else  temp[count++] = num[i++];
        }
        while(i <= mid) temp[count++] = num[i++];
        while (j <= end) temp[count++] = num[j++];
        for(int k = start; k <= end; k++) {
            num[k] = temp[k];
        }
    }
}
