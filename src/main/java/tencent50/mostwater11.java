package tencent50;

public class mostwater11 {
    public static void main(String[] args){
           int[] height = new int[]{1,8,6,2,5,4,8,3,7}; //
           int result = maxArea(height);
           System.out.println(result);
    }

    public static int maxArea(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int maxarea = 0;
        while(head < tail) {
            if(maxarea < Math.min(height[head], height[tail]) * (tail - head)) maxarea = Math.min(height[head], height[tail]) * (tail - head);
            if(height[head] < height[tail]){
                head++;
            }else tail--;
        }
        return maxarea;
    }
}
