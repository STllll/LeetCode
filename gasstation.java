package LeetCode;

public class gasstation {
    public static void main(String[] args){
           int[] gas = new int[]{1,2,3,4,5};
          int[] cost = new int[]{3,4,5,1,2};
//        int[] gas = new int[]{2,3,4};
//        int[] cost = new int[]{3,4,3};
           int result = canCompleteCircuit(gas, cost);
           System.out.println(result);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int result = -1;
        int sum =0;
        for(int a : gas) {
            sum+= a;
        }
        for(int i = 0; i < n ; i++) {
            if( cost[i] > gas[i]) continue;
            result = util(i, gas, cost, sum,0,0);
            if(result != -1) {
                result = i ;
                break;
            }
        }
        return result;
    }

    public static int util(int now, int[] gas, int[] cost, int sum, int ga, int miles) {
         /*
         *  ga 表示到达此加油站时邮箱还有的油
         *  miles表示已行进的路程
         *  sum表示一圈的路
         *
         * */
        int longway = gas[now];
        if(miles + longway + ga - cost[now] >= sum) return 1;
            else if ( ga + longway - cost[now] >= 0){   // 如果能到下一个点
            int index = now +1;
            if(index >= gas.length) index = index - gas.length ;
            return util(index, gas, cost, sum, ga +gas[now] - cost[now]  , miles + cost[now]);
        }
        return -1;
    }
}
