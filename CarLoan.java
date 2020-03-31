public class CarLoan {
	
	public void calculate(int carLoan,int interestRate,int years,int downPayment){
		
		if ( years <= 0 || interestRate <= 0){
	      System.out.println("Error! You must take out a valid car loan.");
	      } else if ( downPayment >= carLoan) {
	      System.out.println("The car can be paid in full");
	      } else {
	      int remainingBalance = carLoan - downPayment;
	      int months = years * 12;
	      int monthlyBalance = remainingBalance / months;
	      int interest = (monthlyBalance * interestRate) / 100;
	      int monthlyPayment = monthlyBalance + interest;
	      System.out.println(monthlyPayment);
	      }
		}
	   
	public static void main(String[] args) {
	    CarLoan newCL = new CarLoan();
	    newCL.calculate(10000, 5, 3, 2000);
	    CarLoan nowyCL = new CarLoan();
	    nowyCL.calculate(234000, 6, 20, 10000);
	 }
}
