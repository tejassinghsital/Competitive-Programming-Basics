import java.util.Scanner;
public class BeautifulMatrix
{
	public static void main(String args[])
	{
		int a[][]=new int [5][5];
		int moves=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				
				a[i][j]=sc.nextInt();
			}

				if(a[i][j]==1)//ye hai index value lene ke liye jha par 1 hai
				{
					if(a[2][2]==a[i][j])//ye check karega ki kahi 1 phele se matrix ke middle me to nahi hai aur 
					//agar hai to 0 print ho jayega... 
					{
						System.out.print(moves);
					}
					else//iska matlab ki 1 matrix ke bich me nahi hai
					{
							while(i<2)//i<3 hai to move me har baar ek plus karvaenge
							{
								i+=1;
								moves+=1;
								if(i==2)
								{
									while(j<2)
										{
											j+=1;
											moves+=1;
											if(j==2)
												break;
											else
												continue;
										}
									while(j>2)
										{
											j-=1;
											moves+=1;
											if(j==2)
												break;
											else
												continue;
										}
								}
								else
									continue;
							}
							
							while(i>2)//i<3 hai to move me har baar ek plus karvaenge
							{
								i-=1;
								moves+=1;
								if(i==2)
								{								{
									while(j<2)
										{
											j+=1;
											moves+=1;
											if(j==2)
												break;
											else
												continue;
										}
									while(j>2)
										{
											j-=1;
											moves+=1;
											if(j==2)
												break;
											else
												continue;
										}
								}
							}
					}
				}
			}
			System.out.println(moves);
		}
	}
}