package LeetCode;

import java.util.*;

public class topk347 {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,2,2,3};
         List<Integer> result = topKFrequent(nums, 2);
         System.out.println(result);
    }

    /*
    * 方法一
    * */
//    public static List<Integer> topKFrequent(int[] nums, int k) {
//        List<Integer> res = new ArrayList();
//        HashMap<Integer, Integer> map = new LinkedHashMap<>();
//        List<Integer>[] result = new List[nums.length + 1];
//        for(int a : nums) {
//            if(!map.containsKey(a)) {
//                map.put(a,1);
//            } else {
//                map.put(a, map.get(a) + 1);
//            }
//        }
//
//        for(Map.Entry<Integer, Integer> b : map.entrySet()) {
//            int value = b.getValue();
//            if(result[value] == null) result[value] = new ArrayList<>();
//            result[value].add(b.getKey());
//        }
//        for(int i=result.length-1;i>=0 && res.size()<k;i--){
//            if(result[i]==null) continue;
//            // 该题没有出现频率相同的数字 不需要考虑其他情况
//            res.addAll(result[i]);
//        }
//        return res;
//    }

  /*
  *
  * 方法二
  * */

    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int a : nums) {
            if(!map.containsKey(a)) {
                map.put(a,1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        return Buildheap(map, k);
    }

    public static List<Integer>  Buildheap(HashMap<Integer, Integer> map, int k){
        int[] heap = new int[k];
        int i = 0;
        for(int key : map.keySet()) {
            if(i < k) {
                heap[i++] = map.get(key);
                continue;
            }
            if( i == k) {
                adjustheap(heap, k);
            }
            if(map.get(key) > heap[0]) {
                heap[0] = map.get(key);
                adjustheap(heap, k);
            }
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        List<Integer> res = new ArrayList<>();
        int count = 0;
        for(int key : map.keySet()) {
            if(count == k ) break;
            if(heap[count++] == map.get(key)) res.add(key);
        }
        Collections.sort(res);
        return res;
    }
    public static void adjustheap(int[] heap, int k) {
        for(int j = 0; j < k/2 ; j++) {
            if(heap[j ] > heap[j * 2 + 1]) {
                int temp = heap[j];
                heap[j] = heap[j * 2 + 1];
                heap[j * 2 + 1] = temp;
            }
            if(j *2 + 2 < k && heap[j ] > heap[j * 2 + 2]) {
                int temp = heap[j];
                heap[j] = heap[j * 2 + 2];
                heap[j * 2 + 2] = temp;
            }
        }
    }
}
