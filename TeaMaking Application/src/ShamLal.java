
/**
 * @author Admin
 *user is a container program design by CTO in the year 2011
 */
public class ShamLal 
{
	public void getorder(String teaName) throws Exception
	{
		Class order = Class.forName(teaName);
		Object obj = order.newInstance (); // upcasting
		Tea tea = (Tea)obj;                // downcasting
		
		tea.making();
		tea.benefits();
		
	}
}




