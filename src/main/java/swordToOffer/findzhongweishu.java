package swordToOffer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class findzhongweishu {
    int count;
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>(){
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    public void Insert(Integer num) {
        count++;
        if((count & 1) == 0) {
            if(!maxheap.isEmpty() && num < maxheap.peek()) {
                maxheap.offer(num);
                num = maxheap.poll();
            }
            minheap.offer(num);
        } else {
            if(!minheap.isEmpty() && num > minheap.peek()) {
                minheap.offer(num);
                num = minheap.poll();
            }
            maxheap.offer(num);
        }
    }

    public Double GetMedian() {
        double result;
        if((count & 1) == 1) result = maxheap.peek();
        else result = (maxheap.peek() + minheap.peek()) / 2.0;
        return result;
    }

}
