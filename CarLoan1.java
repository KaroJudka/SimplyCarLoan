public class CarLoan1 {
   
	public static void main(String[] args) {
    int carLoan = 10000;
    int interestRate = 5;
    int years = 3;
    int downPayment = 2000;
    if ( years <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    } else if ( downPayment >= carLoan) {
      System.out.println("The car can be paid in full");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = years * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
      }    
	}
}
