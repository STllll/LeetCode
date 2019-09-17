package kujiale.ticket;

import java.io.*;

public class buyImpl implements buyticket {
    @Override
    public String buy(String s1, String s2) throws IOException {
        int position = 0;
        FileReader reader = new FileReader("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/A");
        BufferedReader bufferedInputStream = new BufferedReader(reader);
        String[] bufferString = new String[1024];
        String line = null;
        while((line = bufferedInputStream.readLine()) != null) {
                     bufferString[position] = line;
                     String[] buyer = new String[2];
                     buyer = line.split(" ");
                     if(buyer[0].equals(s1)) return "您已购票，请先退票后再尝试操作";
                     position++;
        }
        FileWriter writer = new FileWriter("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/A", true);
        writer.write(s1 + " " + s2 + "\r\n");
        writer.close();

        return "购票成功";
    }
}
