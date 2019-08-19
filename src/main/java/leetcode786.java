import java.util.*;

public class leetcode786 {
    class prime {
        Integer fenzi;
        Integer fenmu;
        prime(Integer fenzi, Integer fenmu) {
            this.fenzi = fenzi;
            this.fenmu = fenmu;
        }
    }
    public static void main(String[] args) {
        leetcode786 leet = new leetcode786();
        int[] a = new int[]{1, 2, 3, 5};
        int[] result = leet.kthSmallestPrimeFraction(a, 3);
        System.out.println(result[0] + " " + result[1]);

    }
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        Queue<prime> heap = new PriorityQueue<>(new Comparator<prime>() {
            @Override
            public int compare(prime o1, prime o2) {
                int a1 = o1.fenzi * o2.fenmu;
                int a2 = o2.fenzi * o1.fenmu;
                return a2 - a1;
            }
        });
        int[] result = new int[2];
        List<prime> combine = getCombine(A);
        for(prime pr : combine){
            if(heap.size() < K) {
                heap.add(pr);
            } else {
                if(ismin(heap.peek(), pr)){
                    heap.poll();
                    heap.add(pr);
                }
            }

        }
        prime result1 = heap.poll();
        result[0] = result1.fenzi;
        result[1] = result1.fenmu;
        return result;
    }
     public boolean ismin(prime a, prime b) {
        int a1 = a.fenzi * b.fenmu;
        int b2 = b.fenzi * a.fenmu;
        return a1 > b2;
     }
    public  List<prime> getCombine(int[] a) {
        List<prime> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < i; j++) {
                prime fenshu = new prime(a[j], a[i]);
                list.add(fenshu);
            }
        }
        return list;
    }
}
