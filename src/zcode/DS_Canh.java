package zcode;

import java.util.Scanner;

public class DS_Canh {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int [][] a=new int[n+1][n+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                a[i][j]=s.nextInt();
                if(a[i][j]==1&&i<j){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
