import java.util.*;
public class twod{
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
        int odd=0;
        int even=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}
