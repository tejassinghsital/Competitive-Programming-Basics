import java.util.Scanner;
public class BF
{
	public static void main(String[] args)
	{
		int a[][]=new int [5][5];
		int moves=0;
		Scanner sc=new Scanner(System.in);
		int j=0,i=0;
		for(;i<5;i++)
		{
			for(;j<5;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		
		for(;i<5;i++)
		{
			for(;j<5;j++)
			{
			if(a[i][j]==1)
			 System.out.println(i+j);
			}
		}
		

	}
}