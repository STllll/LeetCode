package kujiale.ticket;

import java.io.*;
import java.util.ArrayList;

public class refundImpl implements  refundticket {
    @Override
    public String refund(String s1) throws IOException {
        FileReader reader = new FileReader("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/A");
        BufferedReader bufferedInputStream = new BufferedReader(reader);
        int flag = 0;
        ArrayList<String> list = new ArrayList<>();
        String line = null;
        while((line = bufferedInputStream.readLine()) != null) {
            list.add(line);
            String[] info = new String[2];
            info = line.split(" ");
            if(info[1].equals(s1)) {
                list.remove(list.size() - 1);
                flag = 1;
            }
        }
        FileWriter writer = new FileWriter("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/A");
        for(String date : list) {
            writer.write(date + "\r\n");
        }
        writer.close();
        if (flag == 1)
        return "退票成功";
        else return "退票失败";
     }
}
