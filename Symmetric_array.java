import java.util.*;
class symmetric{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
       int arr1[][]=new int[r][c];
        for ( int i = 0; i< r; i++) {
            for ( int j = 0; j < c;j++){
                arr[i][j]=sc.nextInt();
            }   
        }
        int flag=0;
        for ( int i = 0; i<r; i++) {
            for (int j = 0; j<c;j++){
                
               if( arr[j][i]== arr1[i][j]){
                   flag=1;
                   break;
               }
            }
           //if(flag==1) break;
        }
            if(flag==1){
                System.out.println("Symmetric ");
            }else{
                System.out.println("Not Symmetric");
            }
               
            }   
            
        }
