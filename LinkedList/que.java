package LinkedList;

import java.util.LinkedList;
import java.util.*;

public class que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            Queue<Integer> qu = new LinkedList<>();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch (x) {
                case 1:
                    qu.add(y);
                    break;
                case 2:
                    if (!qu.isEmpty())
                        System.out.println(qu.element());
                    else
                        System.out.println(-1);
                    break;
                case 3:
                    qu.poll();
                    break;

            }

        }

    }
}
