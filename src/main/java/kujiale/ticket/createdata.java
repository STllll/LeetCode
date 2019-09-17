package kujiale.ticket;

import java.io.FileWriter;
import java.io.IOException;

public class createdata {
    public static void main(String[] args) throws IOException {
        int a = 1;
        int b = 3316;
        FileWriter writer = new FileWriter("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/ticket/A", true);
        for(int i = 0; i < 50; i++) {
            writer.write(a + " " + b +"\r\n");
            a++;
            b++;
        }
        writer.close();
    }
}
