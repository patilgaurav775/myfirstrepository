package ENCAPSULATION;

public class datahiding {
//you are not allowing datamember directly outside the class
		private int balance=500;
		private int deposit;
		private int loaneligibility;
		private int withdrawl=4500;
		
		
		//to access private data member we use public method
		public int getbalance(int accountnumber) {
			if (accountnumber==123) {
				return this.balance;
			}
			else {
				return 0;
			}
		}
		
		public int getdeposite() {
			return this.deposit;
		}
		
		public int geteligibility() {
			return loaneligibility;   //if we dont add this the compiler will atomatically puts it
		}
		public int getwithdrawl() {
			return withdrawl;
		}
		public void setbalance(int balance) {
			this.balance=balance;
		}
		public void setdeposit(int deposit) {
			this.deposit=deposit;                                             //deposite chi value aapn change keli kiwa update keli
		}
		public void setwithdrawl() {
			this.withdrawl=withdrawl;
		}
}




