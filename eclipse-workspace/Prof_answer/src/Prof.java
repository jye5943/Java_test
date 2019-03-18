import java.util.Scanner;

public class Prof {
	private static Scanner scan;

	public static void main(String[] args) {
	
			int a;
			int b;
			int c;	
			scan = new Scanner(System.in);
				
			a = scan.nextInt();
			
			b = scan.nextInt();
			
			c = scan.nextInt();
		
			
	System.out.println ("총점은" +" "+ (a+b+c)+" "+ "입니다");
	
	double averageScore = 0;
	averageScore = (double)totalScore/3;
	
	System.out.println ("평균은" +" "+ averageScore+" "+ "입니다");
	//자바 반올림 도 검색해서 해볼것
	}
	}

	
