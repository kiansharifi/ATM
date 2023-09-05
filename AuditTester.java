public class AuditTester
{
    public static void main (String [] args) throws Exception
    {
        ATM tester = new ATM ();
        tester.openAccount ("Kian", 200);
        tester.openAccount ("Sammy", 15);
        tester.openAccount ("Wyatt", 105);
        tester.openAccount ("RichPerson", 999999);
        tester.audit (); //If you stop code before closing account, it should print all 4 accounts
        tester.withdrawMoney ("Wyatt", 105);
        tester.closeAccount("Wyatt");
        tester.audit(); //Should print 3 accounts (not including Wyatt)
    }
}