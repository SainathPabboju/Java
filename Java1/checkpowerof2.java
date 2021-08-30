
import java.util.*;

public class checkpowerof2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            long a =s.nextLong();
            if(a>0&&((a&(a-1))==0))
                System.out.println("True");
            else
                System.out.println("False");
                
    }
s.close();}
}