package week3.day2;

public class IndianBank implements Cibil {

	public void minimumBalance() {
		System.out.println(2000);

	}

	public void maximumLoanAmount() {
		System.out.println(200000);

	}

	public static void main(String[] args) {
		IndianBank ib = new IndianBank();

		ib.maximumLoanAmount();
		ib.minimumBalance();
		ib.getCreditScore();

	}

	public void getCreditScore() {
		System.out.println("90%");

	}

}
