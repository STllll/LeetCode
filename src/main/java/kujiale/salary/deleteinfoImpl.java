package kujiale.salary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class deleteinfoImpl implements  deleteinfo {
    @Override
    public String deleteSalary(int n) throws IOException {
        FileReader fileReader = new FileReader("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/salary/A");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> cache = new ArrayList<>();
        String line = null;
        while((line = bufferedReader.readLine())!=null) {
            String[] info = line.split("_");
            if(Integer.valueOf(info[0]) == n) continue;
            cache.add(line);
        }
        FileWriter writer = new FileWriter("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/salary/A");
        for(String data : cache) writer.write(data + "\r\n");
        writer.close();
        fileReader.close();
        return "删除成功!";
    }
}
