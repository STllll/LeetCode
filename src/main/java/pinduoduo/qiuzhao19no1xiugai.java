package pinduoduo;

import java.util.*;

public class qiuzhao19no1xiugai {
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
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < n - k + 1; i++) {
                if(!set.contains(number.charAt(i))) {
                    int count = 0;
                    //判断有多少个数字需要修改
                    for(int j = i; j < number.length(); j++) {
                        if(number.charAt(j) == number.charAt(i)) count++;
                    }
                    if(count == 0) {
                        System.out.println(0);
                        System.out.print(number);
                        break;
                    }
                    int countnumber = k - count;

                }
                set.add(number.charAt(i) - '0');
            }
        sc.close();
    }

}
}
