public class ATM {
    public static void main(String[] args) throws Exception {
        int newID=0;
        double newbalance =0;
        double newintrest=0;
        double withdraw=0;
        double deposit=0;
        double newdate=0;
        int jh = 0;
        double hhh;
        //double[] w = new double[9];
        
        System.out.println("Hello, World!");
        newID = 8;
        withdraw = 10;
        deposit = 10;
        Account atm = new Account(newID, newbalance, newintrest, withdraw, deposit, newdate, jh);
        System.out.println(atm.Withdraw());
        hhh = atm.Withdraw();
        
        System.out.println(atm.Deposit());
       // System.out.println(hhh);
    }
}
