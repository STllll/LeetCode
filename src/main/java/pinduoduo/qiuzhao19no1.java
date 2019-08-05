package pinduoduo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class qiuzhao19no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int k;
        String number;
        while(sc.hasNext()){
            n = sc.nextInt();
            k = sc.nextInt();
            number = sc.next();
            Map<Integer, String> map = new HashMap<>();
            for(int i = 0; i < n - k + 1; i++) {
                int pay = 0;
                for(int j = i; j < k + i; j++){
                    char t = number.charAt(j);
                    char o= number.charAt(i);
                    int cost = t - o;
                    pay +=  Math.abs(cost);
                }
                StringBuffer buffer = new StringBuffer();
                if(i != 0) buffer.append(number.substring(i - 1,i));
                for(int z = 0; z < k; z++) {
                    buffer.append(number.charAt(i));
                }
                buffer.append(number.substring(i + k ));
                map.put(pay, buffer.toString());
            }
            int minpay = Integer.MAX_VALUE;
            String result ="";
            for(Map.Entry<Integer, String> entry: map.entrySet()) {
                if(entry.getKey() < minpay) {
                    minpay = entry.getKey();
                    result = entry.getValue();
                } else if(entry.getKey() == minpay) {
                    if(entry.getValue().compareTo(result) < 0) {
                        minpay = entry.getKey();
                        result = entry.getValue();
                    }
                }
            }
            System.out.println(minpay);
            System.out.print(result);
            break;
        }
    sc.close();
    }

}
