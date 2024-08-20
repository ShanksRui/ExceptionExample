package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import person.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data");
        System.out.print("Number:");
        Integer number = sc.nextInt();
        System.out.print("Holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance:");
        Double initial = sc.nextDouble();
        System.out.print("Withdraw limit:");
        Double withdraw = sc.nextDouble();
        System.out.println();
        System.out.print("Enter amount for withdraw:");
        Double amount = sc.nextDouble();
		Account account = new Account(number, holder, initial, withdraw);
		account.withdraw(amount);
        System.out.println("New Balance:"+ account.getBalance());
	}catch(DomainException e) {
		System.out.println("Error: "+e.getMessage());
	sc.close();
	}
}
}