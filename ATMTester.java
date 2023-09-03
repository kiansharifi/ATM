public class ATMTester
{
    public static void main (String [] args) throws Exception
    {
        ATM bank = new ATM ();
        bank.openAccount ("kiansharifi", 100);
        bank.openAccount ("customer2", 1000);
        bank.openAccount ("customer3", 5);
        bank.openAccount ("soonclosed", 500);

        bank.withdrawMoney("soonclosed", 500);
        bank.closeAccount ("soonclosed");

        System.out.println (bank.checkBalance ("kiansharifi")); //Should be 100

        System.out.println ("Just deposited " + bank.depositMoney("kiansharifi", 300) + " bucks!");
        System.out.println (bank.checkBalance ("kiansharifi")); //Should be 100
        System.out.println ("Just withdrew $" + bank.withdrawMoney ("kiansharifi", 20));
        System.out.println ("Was transfer successful? " + bank.transferMoney ("customer2", "kiansharifi", 1001));
        System.out.println ("Was transfer successful? " + bank.transferMoney ("customer2", "kiansharifi", 900));
        bank.audit();
    }
}