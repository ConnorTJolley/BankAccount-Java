
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private int AccountNo;
    private int Balance;
    private int DepositAmmount;
    private int WithdrawAmmount;
    
    public void Deposit()
    {
        
        
        DepositAmmount = User.inputInt("Please enter the ammount to Deposit: ");
        
        Balance += DepositAmmount;
        
        User.message("New Balance is: £" + Balance);
    }
    
    public void Withdraw()
    {
        WithdrawAmmount = User.inputInt("Please enter the ammount to Withdraw: ");
        
        Balance -= WithdrawAmmount;
        
        User.message("New Balance is: £" + Balance);
    }
}


