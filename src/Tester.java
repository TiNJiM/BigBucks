import java.io.*;
import java.util.*;
import java.text.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList<BankAccount>arylst = new ArrayList<>();
		do
		{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
		name = kbReader.nextLine();
		if(!name.equalsIgnoreCase("EXIT"))
			{
				System.out.print("Please enter the amount of the deposit.");
				Double amount = kbReader.nextDouble();
				System.out.println(" "); //gives an eye-pleasing blank line
				BankAccount nextAccount = new BankAccount(name, amount);
				arylst.add(nextAccount);
			}
		} while(!name.equalsIgnoreCase("EXIT"));
		BankAccount ba = arylst.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;
		for(int j = 1; j < arylst.size(); j++){
			BankAccount checkAccount = arylst.get(j);
			double checkBalance = checkAccount.balance;
			if (checkBalance > maxBalance) {
				maxBalance = checkBalance;
				maxName = checkAccount.name;
			}
		}
		System.out.println("The account with the largest belongs to " + maxName + ".\nThe amount is $" + maxBalance);
	}

}
