package pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i < a; i++) {
            list.add(sc.next());
        }
        System.out.println(list);
    }
}
