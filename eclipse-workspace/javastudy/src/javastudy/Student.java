package javastudy;

public class Student {

	String name ; 
	String number ; 
	int birthYear ;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student() ;
		s1.name = "홍길동"; 
		s1.birthYear = 1992;
		s1.number = "1234";
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.number = "1234"; 
		s2.birthYear = 1992;
		
		if(s1.equals(s2)) {
			System.out.println("s1 와 s2는 같은값이다");
		
		}
		else {
			System.out.println("s1와 s2 는 다른값이다");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		
	}


	@Override
	public String toString() {
		return "Student [이름=" + name + ", 학번=" + number + ", 생일년도=" + birthYear + "]";
	}


	
}
