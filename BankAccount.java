public class BankAccount{
  private double checkingBalance;
  private double savingsBalance;
  private static int numberOfAccounts = 0;
  private static double totalAmount=0;
  
  public BankAccount(){
    checkingBalance=0;
    savingsBalance=0;
    numberOfAccounts++;
  }
  public BankAccount(double checkingBalance, double savingsBalance){
    this.checkingBalance=checkingBalance;
    this.savingsBalance=savingsBalance;
    numberOfAccounts++;
  }

  public double getCheckingBalance(){
    return checkingBalance;
  }

  public double getSavingsBalance(){
    return savingsBalance;
  }
}