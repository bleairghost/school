package school;

public class Test {
	
	public static void main(String[] args) {
		Student studentJay = new Student(1001, "Jay");
		studentJay.addMajor("Computer", 4);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addMajor("Police", 3);
		
		studentJay.showStudentInfo();
		System.out.println("==================");
		
		studentKim.showStudentInfo();
		System.out.println("==================");
	}

}
