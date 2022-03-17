class Test extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class MultiThreadingDemo
{

	public static void main(String[] args) throws InterruptedException 
	{
	Test test = new Test ();
	for (int i =1; i <=10000;i++)
	{
		Thread t = new Thread (test);
		t.start ();
		System.out.println("Thread :"+i);
	}

	}

}
