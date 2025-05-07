//Row sum 
//Coloumn Sum
//Total sum 
// in Two Dimensional Array

import java.util.*;
public class row{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int rsum=0;
            int csum=0;
            for(int j=0;j<c;j++){
                rsum+=arr[i][j];
                csum+=arr[j][i];
                sum=sum+arr[i][j];
                //System.out.print(arr[j][i]+" ");
    }
   
    System.out.println("row sum:" + rsum+" ");
    System.out.println("Coloumn Sum:" + csum+" ");
}
System.out.println("Total:" + sum);
    }
}
