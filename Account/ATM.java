public class ATM {
    public static void main(String[] args) throws Exception {
        int newID=0;
        double newbalance =0;
        double newintrest=0;
        double withdraw=0;
        double deposit=0;
        double newdate=0;
        double[] w = new double[9];
        
        System.out.println("Hello, World!");
        for (int q = 0; q <= 9; q++) {
            newID++;
        }
        Account atm = new Account(newID, newbalance, newintrest, withdraw, deposit, newdate, w);
    }
}
