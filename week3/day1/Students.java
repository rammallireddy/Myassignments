package week3.day1;

public class Students {

	public void getStudentInfo(int a, String b) {
		System.out.println("Student emp is:"+ a);
		System.out.println("Student name is :"+ b);
	}
	
	public void getStudentInfo(String c , long d) {
		System.out.println("The email id is :"+ c);
		System.out.println("the mobile number is :"+ d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu = new Students();
		stu.getStudentInfo(123, "Ramakrishnareddy");
		stu.getStudentInfo("ramakrishna@gmail.com", 99892412);
	}

}
