package pinduoduo;

import java.util.*;

public class pinduoduo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");
        Solution s = new Solution();
        System.out.println(s.canBeRing(str));
        sc.close();
    }
}
class Solution {
    public boolean canBeRing(String[] str) {
        if(str==null || str.length==0) return false;
        boolean[] vis = new boolean[str.length];
        Map<Character,List<Integer>> head = new HashMap<>();
        for(int i = 0; i < str.length; i++) {
            vis[i] = false;
            char headC = str[i].charAt(0);
            putMap(head,headC ,i );
        }
        return util(0,vis,str,head);
    }

    private boolean util(int index,boolean[] visited,String[] str,
                        Map<Character,List<Integer>> head) {
        int i;
        for(i = 0; i < visited.length; i++) {
            if(visited[i]==false) break;
        }
        if(i==visited.length) return true;
        char tailC = str[index].charAt(str[index].length()-1);
        List<Integer> list = head.get(tailC);
        if(list==null) return false;
        boolean found = false;
        //进行排序
        for(i = 0; i < list.size(); i++) {
            int k = list.get(i);
            if(visited[k] == false) {
                visited[k] = true;
                found = util(k,visited,str,head);
                visited[k] = false;
            }
            if(found) break;
        }

        return found;
    }

    public static void putMap(Map<Character,List<Integer>> head, char chr, int i) {
        if(!head.containsKey(chr)) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            head.put(chr,list);
        } else {
            head.get(chr).add(i);
        }
    }
}