
import java.util.*;
public class bubble_count {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,n,i,j,k,l,temp,count;
        int[] ar = new int[1000];
        Scanner s = new Scanner(System.in);
        t=s.nextInt();
        for(i=0;i<t;i++){
            count = 0;
            n=s.nextInt();
            for(l=0;l<n;l++){
                ar[l]=s.nextInt();
            }
            for(k=0;k<n;k++){
                for(j=0;j<n-k-1;j++){
                    if(ar[j]>ar[j+1]){
                        temp=ar[j+1];
                        ar[j+1]=ar[j];
                        ar[j]=temp;
                        count++;
                    }
                }
            }System.out.println(count);
        }
    }
}
