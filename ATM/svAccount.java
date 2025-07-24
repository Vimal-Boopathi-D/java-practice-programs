package ATM;

class svAccount extends Bank{
		svAccount(String acHolder,double balance){
			super(acHolder,balance);
		}
		void deposit(double amount){
			balance+=amount;
			System.out.println("You have deposited Rs."+amount+" in your savings Account");
		}
		void withdraw(double amount){
			if (balance>amount){
				balance-=amount;
				System.out.println("You have withdrawn Rs."+amount+" from your savings account");
			}
			else 
				System.out.println("Insufficient balance!");
		}
	}

