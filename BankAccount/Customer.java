
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    
    private String Name;
    private String Surname;
    private String Address;
    private String Town;
    private String Postcode;
    private String TelNumber;
    private String Email;
    
    public Customer()
    {
        Name = User.inputString("Please enter your First Name:");
        Surname = User.inputString("Please enter your Surname:");
        Address = User.inputString("Please enter your Address:");
        Town = User.inputString("Please enter your Town:");
        Postcode = User.inputString("Please enter your Postcode:");
        TelNumber = User.inputString("Please enter your Telephone Number:");
        Email= User.inputString("Please enter your Email:");
        
    }
    
    public void DisplayDetails()
    {
        String printout = "Name: " + Name + "\n" + "Surname: " + Surname + "\n" + "Address: " + Address + "\n" + "Town: " + Town + "\n";
        String printout2 = "Postcode: " + Postcode + "\n" + "TelNumber: " + TelNumber + "\n" + "Email: " + Email + "\n";
        User.message(printout + printout2);
    }
}
