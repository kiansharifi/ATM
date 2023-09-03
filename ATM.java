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
}