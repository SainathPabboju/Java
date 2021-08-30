package matrix;
import java.util.*;
public class demo {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int i,j;
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[n][m];
    int[][] c = new int[n][m];
    
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            a[i][j]=s.nextInt();
        }

    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            b[i][j]=s.nextInt();
        }

    }
    for(i=0;i<n;i++){    
        for(j=0;j<m;j++){    
        c[i][j]=0;      
        for(int k=0;k<3;k++)      
        {      
        c[i][j]+=a[i][k]*b[k][j];
        
        }
        System.out.print(c[i][j]+" ");      
    }
    System.out.println();
}
}
}
