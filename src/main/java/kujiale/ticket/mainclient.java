package kujiale.ticket;

import java.io.IOException;
import java.util.Scanner;

public class mainclient {
    private  static int ticketMAX = 50;
    public static void main(String[] args) throws IOException {
        int ticket = 9;
        Scanner sc = new Scanner(System.in);
        buyImpl buy = new buyImpl();
        refundImpl refund = new refundImpl();
        checkImpl check = new checkImpl();
        while(true) {
            String action = sc.next();
            if(action.equals("checkin")){
                String data2 = sc.next();
                String result = check.check(data2);
                System.out.println(result);
            }
            else if (action.equals("buy")) {
                if(ticket >= ticketMAX) {
                    System.out.println("票已售完");
                    continue;
                }
                String data1 = sc.next();
                String data2 = sc.next();
                String result = buy.buy(data1, data2);
                ticket++;
                System.out.println(result);
            }
            else if (action.equals("refund")) {
                ticket--;
                String data2 = sc.next();
                String result = refund.refund(data2);
                System.out.println(result);
            }
        }
    }
}
