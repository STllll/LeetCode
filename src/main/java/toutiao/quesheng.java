package toutiao;


import java.util.*;

public class quesheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> storage = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            while (storage.size() / 4 != i) {
                storage.add(i);
            }
        }
        while (sc.hasNext()) {
            for(int t = 0; t < 13; t++) {
                Integer a = sc.nextInt();
                list.add(a);
                storage.remove(a);

            }
            Collections.sort(list);
            Collections.sort(storage);
            List<Integer> result = new ArrayList<>();
            util(list, storage, result);
            if(result.size() == 0) result.add(0);
            else {
                Collections.sort(result);
                System.out.println(result);
            }
        }
        sc.close();

    }

    public static void util(ArrayList<Integer> list, ArrayList<Integer> storage, List<Integer> result) {
        for (int i = 0; i < 23; i++) {
            Integer add = storage.get(i);
            list.add(add);
            for (int j = 0; j < list.size() -1; j++) {    // 找雀头
                int count = 0;
                Collections.sort(list);
                if (list.get(j).equals(list.get(j + 1))) {
                   Integer head = list.get(j);
                    list.remove(head);
                    list.remove(head);
                    ArrayList<Integer> list2 = new ArrayList<>(list);
                    for (int z = 0; z < list.size() - 2; z++) {
                        if ((list.get(z).equals(list.get(z + 1)) && list.get(z).equals(list.get(z + 2)))) {
                            Integer d = list.get(z);
                            list2.remove(d);
                            list2.remove(d);
                            list2.remove(d);
                            count++;
                            z += 2;
                        }
                    }
                    HashSet<Integer> temp = new HashSet<>(new ArrayList<Integer>(list2));
                    ArrayList<Integer> list3 = new ArrayList<>(temp);
                    Collections.sort(list3);
                    for (int x = 0; x < list3.size() - 2; x++) {
                        if (list3.get(x).equals(list3.get(x + 1) -1) && list3.get(x) == list3.get(x + 2) - 2) {
                            count++;
                            x += 2;
                        }

                    }
                    if (count == 4) result.add(add);
                    list.add(head);
                    list.add(head);
                }

            }
            list.remove(add);
        }


    }
}
