package Hash_Map;

import java.util.*;

public class repeated_nos {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int t;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int key : arr) {
                Integer frequency = hm.get(key);
                if (frequency == null)
                    frequency = 1;
                else
                    frequency += 1;
                hm.put(key, frequency);
            }
            // for(Map.Entry k:hm.entrySet()){
            // Integer f = hm.get(k);
            // if(f==2)
            // System.out.println(k.getKey());
            // }
            Arrays.sort(arr);
            for (int k : arr) {
                Integer fr = hm.get(k);
                if (fr == 2) {
                    System.out.print(k + " ");
                    hm.put(k, 0);
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
