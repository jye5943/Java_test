
public class homework0318 {
	public static void main(String[] args) {
		int holSum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				holSum = holSum + i;
			}
		}
		System.out.println("홀수의 합은 :" + (holSum));

	}

}
