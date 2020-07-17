package kujiale.salary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class outputinfoImpl implements ouputinfo {
    @Override
    public void ouputSalary(int n) throws IOException {
        FileReader fileReader = new FileReader("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/salary/A");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> cache = new ArrayList<>();
        String line = null;
        while((line = bufferedReader.readLine())!=null) {
            cache.add(line);
        }
        int size = cache.size();
        for(int i = size - 1; i >= size - n; i-- ) {
            if(i < 0) {
                System.out.println("已成功导出全部记录" + size + "条");
                return;
            }
            System.out.println(cache.get(i));
        }
        fileReader.close();
        System.out.println("导出成功！");
    }
}
