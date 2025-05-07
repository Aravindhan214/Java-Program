/* Wheather the given matrix is Identity or Not*/

import java.util.Scanner;

class identity{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for (int i = 0; i< r; i++) {
            for (int j = 0; j < c;j++){
                arr[i][j]=sc.nextInt();
            }   
        }
        boolean isIdentity=true;
        for (int i = 0; i< r; i++) {
            for (int j = 0; j < c;j++){
                if(i==j && arr[i][j]==1){
                    isIdentity=true;
                }else if(i!=j&&arr[i][j]!=0){
                    isIdentity=false;
                }
            }   
        }
        if(isIdentity){
            System.out.println("It is a identity matrix");
        }else{
            System.out.println("It is not a identity matrix");
        }
    }
}
