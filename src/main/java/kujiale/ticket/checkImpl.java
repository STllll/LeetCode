package kujiale.ticket;

import java.io.*;

public class checkImpl implements checkTicket  {
    @Override
    public String check(String s1) throws IOException {
        int position = 0;
        FileReader reader = new FileReader("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/A");
        BufferedReader bufferedInputStream = new BufferedReader(reader);
        String[] bufferString = new String[1024];
        String line = null;
        while((line = bufferedInputStream.readLine()) != null) {
            bufferString[position] = line;
            String[] buyer = new String[2];
            buyer = line.split(" ");
            if(buyer[1].equals(s1) ) {
                addCheckInfo(s1);
                return "验票成功！";
            }
            position++;
        }
        return "验票失败";
    }
    public void addCheckInfo(String s2) throws IOException {
        OutputStream outputStream = new FileOutputStream("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/B", true);
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.write(s2 + "\r\n");
        printWriter.close();
        outputStream.close();
    }
}
