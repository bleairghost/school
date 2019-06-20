package school;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Major> majorList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		majorList = new ArrayList<Major>();
	}
	
	public void addMajor(String name, int score) {
		Major major = new Major();
		major.setName(name);
		major.setScorePoint(score);
		majorList.add(major);
	}
	
	public void showStudentInfo() {
		Major m = new Major();
		System.out.println("학생 " + studentName + " 은 " + m.getName() + " 전공 입니다 ");
	}

}
