package javastudy;

public class quest {
	
	
	public static void main(String[] args) {
		String name[] = new String[] {"나","너","누","니"}; 
		String subject[] = new String[] {"국어","영어","수학"};
		double scores[][] = new double [name.length][subject.length + 1];
		
		for(int i = 0; i<name.length;i++)
		System.out.print(name[i]);
		System.out.println("----------------");
		System.out.println(name);
	   


}
}