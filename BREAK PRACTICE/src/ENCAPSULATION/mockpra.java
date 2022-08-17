	package ENCAPSULATION;

public class mockpra {

		private int balance=20000;
		private int carvalue=500000;
		
		public int getbalance(int accountnum) {
			if (accountnum==123) {
				return this.balance;
			} 
			else {
				System.out.println("please enter valid credentials");
				return 0;
			}
		}
		
		public int getcarvalue(int modelno) {
			if (modelno==6565) {
				return carvalue;
			} else {
				System.out.println("please enter valid credentials");
				return 0;
			}
		}
		
		public void setbalance(int balance){
			this.balance=this.balance+balance;
			System.out.println("updated balance of your account is "+this.balance);
		}
		
		
		public void setcarvalue(int value){
			this.carvalue=this.carvalue+value;
			System.out.println("updated car value is "+this.carvalue);
		}
		
	}

	class child  {
		
		static int go=100;
		int b=132;
		
		public static void main(String[] args) {
			mockpra name = new mockpra();
			child obj=new child();        
			//int a=name.getbalance(123);
			System.out.println("balance is"+name.getbalance(123));
			
			name.setbalance(60000);          //60000+20000=80000
			
			System.out.println();
			int b=name.getcarvalue(6565);
			System.out.println("previous value of car is is"+b);
			
			name.setcarvalue(100000);
			
			
		}
		
		static{
			System.out.println("i am from static");
		}
		
		{
			System.out.println("i am from non static");
		}
	}

