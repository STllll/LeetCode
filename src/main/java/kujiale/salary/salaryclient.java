package kujiale.salary;

import kujiale.salary.entity.inputdao;

import java.io.IOException;
import java.util.Scanner;

public class salaryclient {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入命令");
        System.out.println("导入数据格式为input 姓名 月份 薪资");
        System.out.println("导出数据格式为list -n 倒出条数");

        Scanner sc = new Scanner(System.in);
        inputsalary inputsalary = new inputsalary();
        outputinfoImpl outputinfo = new outputinfoImpl();
        deleteinfoImpl deleteinfo = new deleteinfoImpl();
        while (true) {
            String s = sc.nextLine();
            String[] action = s.split(" ");
            if(action[0].equals("input")){
                if(action.length != 4) {
                    System.out.println("输入的数据有误，请重试");
                }
                inputdao input = new inputdao();
                input.setName(action[1]);
                input.setMonth(action[2]);
                input.setSalary(action[3]);
                System.out.println(inputsalary.inputSalary(input));
            } else if (action[0].equals("list")) {
                if(action[1].equals("-n")) {
                    int n = Integer.valueOf(action[2]);
                    outputinfo.ouputSalary(n);
                }
            } else if (action[0].equals("delete")) {
                System.out.println(deleteinfo.deleteSalary(Integer.valueOf(action[1])));
            }
            else System.out.println("输入有误，请重试");
        }
    }
}
