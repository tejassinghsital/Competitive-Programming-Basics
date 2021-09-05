import java.util.Scanner;
public class YoungPhysicist
{
	public static void main(String[] args)
	{
		int e=0,h=0,g=0;
		int d=0;
		Scanner sc=new Scanner(System.in);
		int f= sc.nextInt();
		for(int i=0;i<f;i++)
		{
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();

				//d=d+(a+b+c);
				e+=a;
				h+=b;
				g+=c;
		}
		if(e==0 && h==0 && g==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}