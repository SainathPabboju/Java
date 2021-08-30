package Hash_Map;

import java.util.*;

public class unique_elm_hm {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int key : arr) {
            Integer frequency = hm.get(key);
            hm.put(key, frequency == null ? 1 : frequency + 1);

        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1)
                System.out.print(entry.getKey() + " ");
        }
        sc.close();
    }
}