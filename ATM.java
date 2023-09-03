import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class ATM
{
    private HashMap <String, Double> accounts = new HashMap <>();
    
    public void openAccount (String userID, double amount) throws Exception
    {
        if (accounts.containsKey(userID))
        {
            throw new Exception ("This account already exists!");
        }
        else
        {
            accounts.put (userID, amount);
        }
    }
    
    public void closeAccount (String userID) throws Exception
    {
        double balance = accounts.get (userID);
        if (balance > 0)
        {
            throw new Exception ("You need to withdraw your money before closing the account!");
        }
        else
        {
            accounts.remove (userID);
            System.out.println ("Account closed.");
        }
    }
    
    public double checkBalance (String userID) throws Exception
    {
        if (accounts.containsKey (userID))
        {
            return accounts.get (userID);
        }
        else
        {
            throw new Exception ("User not found.");
        }
    }
}