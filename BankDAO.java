import java.nio.file.FileVisitOption;
import java.util.Scanner;

public class BankDAO {

	private String customerId;
	private String customerName;
	private long balance;
	private String[] io = new String[180];
	private int count;

	public void deposit() {
		String message1 = "------------------------\n" + "Enter an amount to deposit" + "\n------------------------";
		System.out.println(message1);
		Scanner sc = new Scanner(System.in);
		long money = sc.nextInt();
		balance += money;
		String message = "------------------------\n" + "deposited: " + money + "\n------------------------";
		io[count++] = message;
		System.out.println(message);
	}

	public void withdraw() {
		String message1 = "------------------------\n" + "Enter an amount to withdraw" + "\n------------------------";
		System.out.println(message1);
		Scanner sc = new Scanner(System.in);
		long money1 = sc.nextInt();
		System.out.println(message1);
		if (this.balance - money1 < 0) {
			System.out.println("----------------");
			System.out.println("lack of balance");
			System.out.println("----------------");
		} else {
			balance -= money1;
			String message = "------------------------\n" + "withdrawn: " + money1 + "\n------------------------";
			io[count++] = message;
		}
	}

	public void transfer() {
		String message1 = "------------------------\n" + "Enter an amount to transfer" + "\n------------------------";
		Scanner sc = new Scanner(System.in);
		long money1 = sc.nextInt();
		if (this.balance - money1 < 0) {
			System.out.println("----------------");
			System.out.println("lack of balance");
			System.out.println("----------------");
		} else {
			this.balance -= money1;
			balance += money1;
			String message = "------------------------\n" + "transfered: " + money1 + "\n------------------------";
			io[count++] = message;
		}
	}

	public void getBalance() {
		String message = "------------------------\n" + "balance: " + balance + "\n------------------------";
		System.out.println(message);
		io[count++] = message;
	}

	public void printIo() {
		if (count == 0) {
			System.out.println("There is no transaction! First, start any transaction please ~ ");
		} else {
			System.out.println(io[count - 1]);
		}
	}
}
//
//	@Override
//	public String toString() {
//		return "account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", password="
//				+ password + ", count=" + count + "]";
//	}
