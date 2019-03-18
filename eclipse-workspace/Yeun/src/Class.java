import java.util.Scanner;

public class Class {
public static void main(String[] args) {
	System.out.println("화면에 숫자를 입력해 주세요");
	Scanner s = new Scanner (System.in);
	int inputNumber = s.nextInt();
    int t =10 ;
	inputNumber= inputNumber+t;
	System.out.print("입력한 숫자는");
	System.out.print(inputNumber);
	System.out.println();
	
	
	System.out.println("화면에 숫자를 입력해 주세요");
	Scanner p1 = new Scanner (System.in);
	Scanner p2 = new Scanner (System.in);
	int input = p1.nextInt();
	int inputs = p2.nextInt();
	System.out.print("입력한 숫자는");
	System.out.print(input+inputs);

	

}
}
