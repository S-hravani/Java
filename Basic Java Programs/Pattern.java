import java.util.Scanner;
public class Pattern {

        public static void main(String args[]) {
            int r, c, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of rows :");
            r = sc.nextInt();
            int array[] = new int[r];
            for(int i=1;i<=r;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }System.out.println();
            }
        }
    }
/*
op
Enter row in pattern :
5
*
* *
* * *
* * * *
* * * * *

 */

