public class CarLoan {
  
  static int carLoan;
  static int interestRate;
  static int years;
  static int downPayment;
  static int monthlyPayment;
  
  public void calculate(int carL,int rate,int year,int dPay){
    carLoan = carL;
    interestRate = rate;
    years = year;
    downPayment = dPay;
    monthlyPayment = mPayment;
    if ( year <= 0 || rate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    } else if ( dPay >= carL) {
      System.out.println("The car can be paid in full");
    } else {
      int remainingBalance = carL - dPay;
      int months = year * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * rate) / 100;
      mPayment = monthlyBalance + interest;
      return mPayment;
      System.out.println(mPayment);
    }
  }
   
	public static void main(String[] args) {
    CarLoan newCL = new CarLoan();
    System.out.println(newCL.calculate(10000, 5, 3, 2000));
  }
