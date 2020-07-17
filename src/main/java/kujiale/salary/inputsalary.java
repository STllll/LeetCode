package kujiale.salary;

import kujiale.salary.entity.inputdao;

import java.io.*;
import java.sql.Timestamp;
import java.util.Date;

public class inputsalary implements addinfo {

    @Override
    public String inputSalary(inputdao input) throws IOException {
        FileReader fileReader = new FileReader("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/salary/A");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] cache = new String[1024];
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        int position = 0;
        String line = null;
        while((line = bufferedReader.readLine())!=null) {
            String[] info = line.split("_");
            position = Integer.parseInt(info[0]);
            if(input.getName().equals(info[1])) {
                if(input.getMonth().equals(info[2]) && input.getSalary().equals(info[3])) return "薪资记录重复，请重试";
                /*StringBuffer buffer = new StringBuffer();*/
                /*cache[position++] = buffer.append(data[0]).append("_").append(data[1]).append("_").append(data[2]).toString();
                FileWriter fileWriter = new FileWriter("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/salary/A",true);
                fileWriter.write(buffer.append(data[0]).append("_").append(data[1]).append("_").append(data[2]).toString() + "\r\n");
                return "更新成功";*/
            }
//            cache[position++] = line;
        }
        FileWriter fileWriter = new FileWriter("/Users/shen/IdeaProjects/LeetCode/src/main/java/kujiale/salary/A",true);
        fileWriter.write(position+1 + "_" + input.getName() + "_" + input.getMonth() + "_" + input.getSalary() + "_" + timestamp + "\r\n");
        fileWriter.close();
        fileReader.close();
        return "添加成功！";
    }
}
