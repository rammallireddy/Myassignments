package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		System.out.println("I will call you");
	}

	public void SendMsg() {
		
		System.out.println("I will send you msg");
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.SendMsg();
	}
}
