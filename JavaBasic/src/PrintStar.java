import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		        int i, j, k=8;
		        for(i=0; i<5; i++)
		        {
		            for(j=0; j<k; j++)
		            {
		                System.out.print("7");
		            }
		            k = k - 2;
		            for(j=0; j<=i; j++)
		            {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
	
	/*

    int i, space, rows, k=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Number of Rows : ");
    rows = scan.nextInt();
    for(i=1; i<=rows; i++) // i is less than  rows=10
    {
        for(space=1; space<=(rows-i); space++) // space is less than 10-1=9
        {
            System.out.print("  ");
        }
        while(k != (2*i-1))
        {
            System.out.print(" *");
            k++;
        }
        k = 0;
        System.out.println();
    }
} */
		
}
}
