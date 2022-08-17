package java04;

abstract class RBIBank {
	abstract double getRateOfInterestForHomeLoan();
	void loan() {
		System.out.println("As per RBI loan..");
	}
}
class SBI extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class PNB extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 7.5;
	}
}
class abstraction2 {
	public static void main(String args[]) {		
		PNB p1=new PNB();
		System.out.println("PNB Rate of Interest is: " + p1.getRateOfInterestForHomeLoan() + " %");
		SBI s1=new SBI();	
		System.out.println("SBI Rate of Interest is: " + s1.getRateOfInterestForHomeLoan() + " %");
		RBIBank b1 = new SBI();
		System.out.println("RBI reference but object of SBI, Rate of Interest is: " + b1.getRateOfInterestForHomeLoan() + " %");
		RBIBank b2 = new PNB();
		System.out.println("RBI reference but object of PNB, Rate of Interest is: " + b2.getRateOfInterestForHomeLoan() + " %");
		
	}
}
