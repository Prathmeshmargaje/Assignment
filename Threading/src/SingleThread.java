
public class SingleThread
{

	public static void main(String[] args) throws Exception
	{
	for (int i=1;i<=100;i++)
		{
		Thread.sleep(200);
		System.out.println("Thread "+i);
		}

	}

}
