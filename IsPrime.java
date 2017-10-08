import java.util.Scanner;
public class IsPrime
{
	public static boolean isPrime(int n)
	{
		int even=0;
		if(n<1)
		{
			return false;
		}
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			
				even=even+1;
				if((even>2)||(n==1))
				{
					return false;
				}
			}
		}
	return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked for prime number:");
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}
}
