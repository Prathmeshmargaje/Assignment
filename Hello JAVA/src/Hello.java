
public class Hello {

	public static void main(String[] args) {
		char ch1= 'J', ch2=  'A', ch3= 'V', ch4= 'A';
		System.out.println(ch1+"\t"+ ch2 +"\t"+ ch3 + "\t"+ ch4);
		
		ch1= ch4;
		ch2=ch3;
		ch3= ch1;
		ch4=ch2;
		
		System.out.println(ch1+"\t"+ch2+"\t"+ch3+"\t"+ch4);
		
		

	}

}
