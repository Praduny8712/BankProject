package validation;

public class AccountValidation {
	public boolean checkaccNo(int accNo) {
		if (accNo < 0) {
			System.out.println("Invalid account number...!!!!! Thank-you!!");
			return false;
		} else 
			return true;
		
	}

	public boolean checkBalance(double balance) {
		if (balance <= 0) {
			System.out.println("Balance in invalid...!!!");
			return false;
		} else if (balance > 100000) {
			System.out.println("Please show the Proof");
			return false;
		} else
			return true;
	}

	public boolean checkAccHolderName(String accHolderName) {
		boolean valid = false;
		char ch;
		for (int i = 0; i < accHolderName.length(); i++) {
			ch = accHolderName.charAt(i);
			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				valid = true;
			} else {
				valid = false;
				break;
			}
		}
		if (valid == true) {
			System.out.println("Valid Name.....!!");
			return true;
		} else {
			System.out.println("Name is invalid.......!!");
			return false;
		}
	}

	public boolean checkAll(int accNo, String accHolderName, double balance) {
		if (!checkaccNo(accNo))
			return false;
	    if (!checkAccHolderName(accHolderName))
			return false;
		if (!checkBalance(balance))
			return false;
		else
			return true;
	}
}
