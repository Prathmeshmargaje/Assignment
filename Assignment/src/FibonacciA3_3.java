
class FibonacciA3_4 
{
	public static void main(String[] args)
	{
		int fnum=0,snum=1,sum=0;
		System.out.println(fnum);
		System.out.println(snum);
		for(int i=0;i<5;i++) 
		{
			sum=fnum+snum;
			fnum=snum;
			System.out.println(sum);
			snum=sum;			
		}
	}
}
