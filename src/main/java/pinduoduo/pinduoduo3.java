/*
package basic.graph;


import java.util.ArrayList;
import java.util.Scanner;

class util{


    boolean flag;
    double time;

    int fc;

    ArrayList<Integer> sons;


    public util(int ns,double tim,int taskCount){
        flag = false;
        time = tim;
        fc = 0;
        sons = new ArrayList<Integer>();
    }
}


public class pinduoduo3{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int [] tm = new int[num1];
        for (int i = 0; i < num1; i++) {
            tm[i] = scanner.nextInt();
        }
        int[][] yl = new int[num2][2];
        for (int i = 0; i < num2 ; i++) {
            int t1 = scanner.nextInt();
            int t2 = scanner.nextInt();
            yl[i][0] = t1;
            yl[i][1] = t2;
        }

        ArrayList<util> tasks = new ArrayList<util> ();
        for(int i=0;i<num1;i++){
            tasks.add(new util(i,tm[i],num1));
        }


        for(int i=0;i<yl.length;i++){
            int fa = yl[i][0]-1;
            int so = yl[i][1]-1;
            tasks.get(fa).sons.add(so);
            tasks.get(so).fc += 1;
        }


        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<tasks.size();i++){
            if(tasks.get(i).fc == 0 && tasks.get(i).flag==false){
                tasks.get(i).flag=true;
                list.add(i);
            }
        }

        ArrayList<Integer> results = new ArrayList<Integer>();
        while(true){

            if(list.size()==0){
                for(int i=0;i<results.size();i++){
                    if(i==0){
                        System.out.print(results.get(i)+1);
                    }else{
                        System.out.print(" "+(results.get(i)+1));
                    }
                }
                break;
            }

            int minInd = 0;
            for(int i=1;i<list.size();i++) {
                if ((tasks.get(list.get(i)).time < tasks.get(list.get(minInd)).time)
                        || (tasks.get(list.get(i)).time == tasks.get(list.get(minInd)).time && list.get(i) < list.get(minInd))) {
                    minInd = i;
                }
            }
            results.add(list.get(minInd));

            for(int i=0;i<tasks.get(list.get(minInd)).sons.size();i++){
                tasks.get(tasks.get(list.get(minInd)).sons.get(i)).fc -= 1;
            }
            list.remove(minInd);
            for(int i=0;i<tasks.size();i++){
                if(tasks.get(i).fc == 0 && tasks.get(i).flag==false){
                    tasks.get(i).flag=true;
                    list.add(i);
                }
            }


        }


    }
}*/
