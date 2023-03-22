import java.util.Scanner;
public class Two_D_Array {
    public static void main(String args[]){
        int r,c,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row of 2D array :");
        r=sc.nextInt();
        System.out.println("Enter col of 2D array :");
        c=sc.nextInt();
        int array [][]=new int[r][c];
        System.out.println("Enter elements of 2D array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("done");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print(array[i][j] + " ");// print onlybas on same line
            }System.out.println();
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+array[i][j];}
        }

        System.out.println("Sum of array elements :"+sum);

    }
}
