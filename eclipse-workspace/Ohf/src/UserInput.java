import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	System.out.println("화면에 숫자를 입력해 주세요");
	Scanner t = new Scanner(System.in);
	int inputNumber = t.nextInt();
	System.out.print("입력한 숫자는");
	System.out.print(inputNumber); 	
	System.out.println();

	System.out.println("또 숫자를 입력해 주세요");
	int number2= t.nextInt();
	System.out.print("입력한 숫자는");
	System.out.print(number2);
}
}
