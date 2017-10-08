public class Factorial1

{
	public static long factorial(int n)
	{
	long product=1;
	for(int i=0;i<=n;i++)
	product=product*i;
	return product;
	}
public static void main(String[] args)
{
	int n=	Integer.parseInt(args[0]);
	System.out.println(Factrorial(n));
}
}

