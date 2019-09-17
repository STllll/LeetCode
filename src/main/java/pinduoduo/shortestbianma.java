package pinduoduo;

import java.util.Scanner;

public class shortestbianma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(util(str).length());
    }

    public static String util(String str) {
        if (str.length() <= 4) return str;
        int l = str.length();
        String seg1 = "", seg2 = "", seg3 = "";
        int bestlen = l ;
        int repeattime = 0;
        int repeatlen = l >> 1;
        while(repeatlen >= 1) {
            for (int i = 0; i <= l - (repeatlen<<1); i++) {
                       int count = 1;
                       String s2 = str.substring(i, i + repeatlen);
                       for(int j = 1; i + j * repeatlen + repeatlen <= l; j++) {
                           String s3 = str.substring(i + j * repeatlen, i + (j + 1) * repeatlen);
                           if(s2.equals(s3)) count++;
                           else break;
                       }
                       int newlen = l - count * repeatlen + 3 + repeatlen;
                       if(newlen < l && newlen < bestlen) {
                           bestlen = newlen;
                           repeattime = count;
                           seg1 = str.substring(0, i);
                           seg2 = str.substring(i, i + repeatlen);
                           seg3 = str.substring(i + count * repeatlen);
                       }
            }
            repeatlen--;
        }
       if(repeattime == 0) return str;
       else return util(seg1) + repeattime + "[" + util(seg2) + "]" + util(seg3);
    }
//
//        if(s.length() <= 4) return s;
//        int len = s.length();
//        int rptLen = len>>1; // 当前尝试的重复的长度
//        int bestRptTime = 0;
//        int bestCompressLen = len;
//        String seg1 = "", seg2 = "", seg3 = "";
//        while(rptLen >= 1){
//            for(int k = 0; k <= len - (rptLen<<1); k++){ // 从k位置开始寻找，至少留两段
//                int count = 1;
//                String s2 = s.substring(k,k+rptLen);
//                for(int j = 1; k+j*rptLen+rptLen <= len; j++){ // 判断最多重复几次
//                    String s3 = s.substring(k+j*rptLen, k+(j+1)*rptLen);
//                    if(s2.equals(s3)) count++;
//                    else break;
//                }
//                int newLen = len-count*rptLen+3+rptLen;
//                if(newLen < len && newLen < bestCompressLen){ // 新长度合适
//                    bestCompressLen = newLen;
//                    bestRptTime = count;
//                    seg1 = s.substring(0,k);
//                    seg2 = s.substring(k,k+rptLen);
//                    seg3 = s.substring(k+count*rptLen);
//                }
//            }
//            rptLen--;
//        }
//        if(bestRptTime == 0) return s;
//        return util(seg1)+bestRptTime+"["+util(seg2)+"]"+util(seg3);
//    }
}
