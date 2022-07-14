package assignment;

public class MyMobile {

	int a = 100;
	long b = 1235L;

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make call");
	}

	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("send message");
	}

	private void payBills() {
		// TODO Auto-generated method stub
		System.out.println("pay bills");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile print = new MyMobile();
		print.makeCall();
		print.sendMsg();
		print.payBills();
		System.out.println(print.a);
		System.out.println(print.b);
	}

}
