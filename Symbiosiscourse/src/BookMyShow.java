 class TicketBooking implements Runnable
{
	int aviTicket;
	int resTicket;
	public TicketBooking (int aviTicket, int resTicket)
	{
		this.aviTicket=aviTicket;
		this.resTicket=resTicket;
	}
	public synchronized void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Welcome to the ticket booking"+t.getName());
		if(resTicket<=aviTicket)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(resTicket + "Booked for user "+t.getName());
			System.out.println(aviTicket +" Are available");
		}
			else
			{
				System.out.println("Ticket are not available");
			}
			aviTicket = aviTicket-resTicket;
		}
	
}
public class BookMyShow
{

	public static void main(String[] args) 
	{
	TicketBooking tickets = new TicketBooking(10,6);
	Thread t1 = new Thread (tickets);
	t1.setName("Raj");
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	Thread t2 = new Thread (tickets);
	t2.setName("Priya");
	t2.setPriority(3);
	t2.start();
	Thread t3 = new Thread (tickets);
	t3.setName("Kunal");
	t3.start();
	
	

	}

}
