
public class ArrayMax {

	public static void main(String[] args) 
	{
	int arr[] = {1,3,7,9,3,11,3,5,9};
	int num = 3;
	int count = 0;
	for (int i =0;i<arr.length;i++)
	{
		if (num==arr[i])
		{
			count = arr[i];
		}
	}
	if (count >=1)
	{
		System.out.println("number is same");
	}
	else
		System.out.println("number is different");
	System.out.println(count);

	}

}
