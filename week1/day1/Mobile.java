package week1.day1;

public class Mobile {
	
	
	public void makeCall() {
		long mobileNumber = 53534534L;
		System.out.println("call connected");
		System.out.println(mobileNumber);
	}
	
	public void sendSms() {
		System.out.println("sms sent");
		
	}
	
	public void takeSnap() {
		System.out.println("snap taken");
	
	}
	

	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		
		mob.makeCall();
		mob.sendSms();
		mob.takeSnap();
		
	}

}
