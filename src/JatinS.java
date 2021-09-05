import java.util.Scanner;
public class JatinS
{
	public static void main (String argh[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int m= sc.nextInt();
		int h=0;

		Ukip obj=new Ukip();
		obj.userip();

		for(int i=1;i<=t;i++)
		{
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();

			

			a= cpow(a)%m;
			b= cpow(b)%m;
			c= cpow(c)%m;

			if(a>b && a>c)
				h=h+a;
			else if(b>c)
				h=h+b;
			else
				h=h+c;
			
		}
		
	}

	public static int cpow(int a)
	{
		return a*a;
	}
}

class Ukip
{
	pubilc void userip(int ... a)
}
